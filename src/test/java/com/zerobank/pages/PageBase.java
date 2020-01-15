package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    @FindBy(css = ".brand")
    @CacheLookup
    public WebElement brandLogo; // It stands for the bank logo on all pages

    @FindBy(id = "search")
    public WebElement searchBar;

    @FindBy(xpath = "//li[@class=\"dropdown\"][1]")   // #xyz ==> div[id='xyz']
    @CacheLookup
    public WebElement settingsButton;

    @FindBy(xpath = "//li[@class=\"dropdown\"][2]")
    public WebElement usernameBar;

    @FindBy(id = "logout_link")
    public WebElement logoutButton;

    @FindBy(xpath = "//a[text()='Account Summary']")
    public WebElement accountSummaryTab;

    @FindBy(xpath = "//a[text()='Account Activity']")
    public WebElement accountActivityTab;

    @FindBy(xpath = "//a[text()='Transfer Funds']")
    public WebElement transferFundsTab;

    @FindBy(xpath = "//a[text()='Pay Bills']")
    public WebElement payBillsTab;

    public PageBase() {
        PageFactory.initElements(Driver.get(), this);
    }
    public boolean verifyLogoDislayed() {
        return brandLogo.isDisplayed();
    }
    public boolean verifySearchBarDisplayed() {
        return searchBar.isEnabled();
    }
    public void logout() {
        usernameBar.click();
        BrowserUtils.waitForClickablility(logoutButton,10);
        logoutButton.click();
    }
    public String getUsername() {
        BrowserUtils.waitForVisibility(usernameBar, 5);
        return usernameBar.getText();
    }
    public void navigateTo(String tab){

        Driver.get().findElement(By.xpath("//a[text()='"+tab+"']")).click();



    }

}