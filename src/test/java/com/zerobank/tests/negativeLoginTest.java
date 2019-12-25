package com.zerobank.tests;

import com.zerobank.TestBase;
import com.zerobank.pages.loginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class negativeLoginTest extends TestBase {

    @Test
    public void wrongUserandPassword()throws InterruptedException{

        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("mcabrera30@info.com");
        loginPage.password.sendKeys("sexybeast");
        Thread.sleep(1000);
        loginPage.loginBtn.click();
        Boolean actualMessage = driver.getPageSource().contains("Wrong login/password");
        String expectedMessage = "class=\'alert alert-danger\'";
        Assert.assertNotEquals(actualMessage,expectedMessage);
        System.out.println("Actual Message is " + actualMessage);
        System.out.println("Expected Message is "+ expectedMessage);
    }
    @Test
    public void incorrectPassword() throws InterruptedException{
        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("posmanager70@info.com");
        loginPage.password.sendKeys("superAdmin");
        loginPage.loginBtn.click();



    }
    @Test
    public void incorrectEmailAddress() throws InterruptedException{
        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("cybertekabiAbu@info.com");
        loginPage.password.sendKeys("posmanager");
        loginPage.loginBtn.click();
    }
    @Test
    public void emptyEmailAddress() throws InterruptedException{
        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("        ");
        loginPage.password.sendKeys("posmanager");
        loginPage.loginBtn.click();
    }

}

