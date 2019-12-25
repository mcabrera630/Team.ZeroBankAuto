package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
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
    public loginPage() {
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










}
