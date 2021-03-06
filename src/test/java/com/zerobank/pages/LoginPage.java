package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    //Page Object Model vs Page Factory
    /*
    POM design patter in selenium, organization of packages in a certain way
    Page Factory--> class in selenium which we can create page object model

    When we create Page object class, we create public constructor for this class
     in the constructor body we call the initElements from the PageFactory class.
     Inside Selenium there is PageFactory class, we can use initElement which is inside pagefactory class

    Page Object Model beneifts-
    -keeps test logics and locators seperate
    -
     */
    public LoginPage() {
//        we need this next line in evey single page object model,(first
//        parameter is WebDriver object, second is instance of this object.)

        PageFactory.initElements(Driver.get(), this);
    }
    // we make them public to be able to locate them in other packages
    //@findBy --> annotation from Selenium used to provide locators

    @FindBy(id="login")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(css = "button[type='submit']")
    public WebElement loginBtn;

    @FindBy (xpath = "//li[.='#Inbox']")
    public WebElement title;

    @FindBy (xpath = "//p[.]")
    public WebElement errorMessageLogin;

    @FindBy(id="signin_button")
    public WebElement signinButton;

    @FindBy(id="user_login")
    public WebElement username;

    @FindBy(css = "input[name=\"submit\"]")
    public WebElement submitButton;

    @FindBy(xpath = "//h3[contains(text(),\"Troubles\")]")
    public WebElement troubleMessage;

    @FindBy(css = ".alert.alert-error")
    public WebElement errorMessage;

    public void openUrl(){
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void login(String username, String password) {
        signinButton.click();
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        submitButton.click();
    }

    public boolean verifyAccountSummary(){
        String expectedTitle="Zero - Account Summary";
        String actualTitle=Driver.get().getTitle();
        boolean verification=expectedTitle.equals(actualTitle);
        return verification;
    }
    public boolean verifyTroubleMessageDisplayed(){
        return troubleMessage.isDisplayed();
    }
    public boolean verifyErrorMessageDisplayed(){
        return errorMessage.isDisplayed();
    }

    public void navigateTo(String tab) {
        Driver.get().findElement(By.xpath("//a[text()='"+tab+"']")).click();
    }
}
