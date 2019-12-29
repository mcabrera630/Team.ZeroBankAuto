package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewPayeePage extends PageBase {

    public AddNewPayeePage(){
        PageFactory.initElements(Driver.get(),this);
    }
    LoginPage loginPage=new LoginPage();

    @FindBy(xpath = "//a[text()='Add New Payee']")
    public WebElement addNewPayeeTab;

    @FindBy(id = "np_new_payee_name")
    public WebElement payeeName;

    @FindBy(id = "np_new_payee_address")
    public WebElement payeeAddress;

    @FindBy(id = "np_new_payee_account")
    public WebElement payeeAccount;

    @FindBy(id = "np_new_payee_details")
    public WebElement payeeDetails;

    @FindBy(id = "add_new_payee")
    public WebElement addButton;

    @FindBy(css = "div[id='alert_content']")
    public WebElement confirmation;

    public void clickAddNewPayeeTab(){
        loginPage.openUrl();
        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
        navigateTo("Pay Bills");
        addNewPayeeTab.click();
    }

    public void addNewPayee(String name, String address, String account, String payeeDetails){
        payeeName.sendKeys(name);
        payeeAddress.sendKeys(address);
        payeeAccount.sendKeys(account);
        this.payeeDetails.sendKeys(payeeDetails);
        addButton.click();
    }

    public String verifyMessage(){
        BrowserUtils.waitForVisibility(confirmation,5);
        String actualMessage=confirmation.getText();
        return actualMessage;
    }

}