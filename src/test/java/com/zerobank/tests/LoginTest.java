package com.zerobank.tests;

import com.zerobank.TestBase;
import com.zerobank.pages.loginPage;
import com.zerobank.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

    // positive Test Case Scenarios Below

    @Test
    public void TestPosManager70() throws InterruptedException {

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
    @Test
    public void TestposManager71() throws InterruptedException {
        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("posmanager71@info.com");
        loginPage.password.sendKeys("posmanager");
        loginPage.loginBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(loginPage.title));
        String actualTitle = driver.getTitle();
        String expectedTitle = "#Inbox - Odoo";
        Assert.assertEquals(actualTitle, expectedTitle);

    }
    @Test
    public void testposManager72() throws InterruptedException{
        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("posmanager72@info.com");
        loginPage.password.sendKeys("posmanager");
        loginPage.loginBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(loginPage.title));
        String actualTitle = driver.getTitle();
        String expectedTitle = "#Inbox - Odoo";
        Assert.assertEquals(actualTitle, expectedTitle);

    }
    @Test
    public void testposManager73() throws InterruptedException{
        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("posmanager73@info.com");
        loginPage.password.sendKeys("posmanager");
        loginPage.loginBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(loginPage.title));
        String actualTitle = driver.getTitle();
        String expectedTitle = "#Inbox - Odoo";
        Assert.assertEquals(actualTitle, expectedTitle);

    }
    @Test
    public void testposManager74() throws InterruptedException {
        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("posmanager74@info.com");
        loginPage.password.sendKeys("posmanager");
        loginPage.loginBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(loginPage.title));
        String actualTitle = driver.getTitle();
        String expectedTitle = "#Inbox - Odoo";
        Assert.assertEquals(actualTitle, expectedTitle);

    }
    @Test
    public void TestEventsCrmManager90() throws InterruptedException{

        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("eventscrmmanager90@info.com");
        loginPage.password.sendKeys("eventscrmmanager");
        loginPage.loginBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(loginPage.title));
        String actualTitle = driver.getTitle();
        String expectedTitle = "#Inbox - Odoo";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test
    public void TestEventscrmManager91() throws InterruptedException{
        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("eventscrmmanager91@info.com");
        loginPage.password.sendKeys("eventscrmmanager");
        loginPage.loginBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(loginPage.title));
        String actualTitle = driver.getTitle();
        String expectedTitle = "#Inbox - Odoo";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test
    public void TestEventscrmManager92() throws InterruptedException{
        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("eventscrmmanager92@info.com");
        loginPage.password.sendKeys("eventscrmmanager");
        loginPage.loginBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(loginPage.title));
        String actualTitle = driver.getTitle();
        String expectedTitle = "#Inbox - Odoo";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test
    public void TestEventscrmManager93() throws InterruptedException{
        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("eventscrmmanager93@info.com");
        loginPage.password.sendKeys("eventscrmmanager");
        loginPage.loginBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(loginPage.title));
        String actualTitle = driver.getTitle();
        String expectedTitle = "#Inbox - Odoo";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test
    public void TestEventscrmManager94() throws InterruptedException{
        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("eventscrmmanager94@info.com");
        loginPage.password.sendKeys("eventscrmmanager");
        loginPage.loginBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(loginPage.title));
        String actualTitle = driver.getTitle();
        String expectedTitle = "#Inbox - Odoo";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test
    public void TestEventscrmManager10() throws InterruptedException{
        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("eventscrmmanager10@info.com");
        loginPage.password.sendKeys("eventscrmmanager");
        loginPage.loginBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(loginPage.title));
        String actualTitle = driver.getTitle();
        String expectedTitle = "#Inbox - Odoo";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test
    public void TestEventscrmManager11() throws InterruptedException{
        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("eventscrmmanager11@info.com");
        loginPage.password.sendKeys("eventscrmmanager");
        loginPage.loginBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(loginPage.title));
        String actualTitle = driver.getTitle();
        String expectedTitle = "#Inbox - Odoo";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    /*
    Negative Test Cases Below:
    */

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

        Assert.assertEquals(driver.getCurrentUrl(),"http://34.220.250.213/web/login");

    }
    @Test
    public void incorrectEmailAddress() throws InterruptedException{
        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("cybertekabiAbu@info.com");
        loginPage.password.sendKeys("posmanager");
        loginPage.loginBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://34.220.250.213/web/login");
    }
    @Test
    public void emptyEmailAddress() throws InterruptedException{
        loginPage loginPage = new loginPage();
        loginPage.email.sendKeys("        ");
        loginPage.password.sendKeys("posmanager");
        loginPage.loginBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://34.220.250.213/web/login");

    }

    // reduce less lines

    @Test
    public void EmptyemailandPasscode(){
        loginPage loginPage = new loginPage();
        loginPage.login(" ","");
        Assert.assertEquals(driver.getCurrentUrl(),"http://34.220.250.213/web/login");

   //hellloo
    }

}

