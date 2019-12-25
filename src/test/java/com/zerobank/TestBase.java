package com.zerobank;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.util.concurrent.TimeUnit;
//class for SetUp on each page.
public class TestBase {
    protected WebDriver driver;

    protected  String url;
    @BeforeMethod
    public void setupMethod() {
        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        url = ConfigurationReader.get("url");
        driver.get(url);
    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(1000);
        Driver.closeDriver();
    }
}