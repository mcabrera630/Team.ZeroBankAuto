package com.zerobank.stepdefinitions;
import com.zerobank.utilities.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    WebDriver driver=Driver.get();
    @Before
    public void setUp(){
        System.out.println("This is before method...");
    }
    @After
    public void tearDown(){
        driver.close();
    }

}