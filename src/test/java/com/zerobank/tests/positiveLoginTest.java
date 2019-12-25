package com.zerobank.tests;

import com.zerobank.TestBase;
import com.zerobank.pages.loginPage;
import com.zerobank.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class positiveLoginTest extends TestBase {

    @Test
    public void PasswordTest() throws InterruptedException {

        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("posmanager70@info.com");
        loginPage.password.sendKeys("posmanager");
        loginPage.loginBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(loginPage.title));
        String actualTitle = driver.getTitle();
        String expectedTitle = "#Inbox - Odoo";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

}