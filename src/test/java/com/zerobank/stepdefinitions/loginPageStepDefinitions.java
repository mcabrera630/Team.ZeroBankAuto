package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginPageStepDefinitions {
    LoginPage loginPage=new LoginPage();

    @Given("user is already on home page")
    public void user_is_already_on_login_page() {
        loginPage.openUrl();
    }

    @When("user enters {string} and {string} and clicks Sign in button")
    public void user_enters_and_and_clicks_Sign_in_button(String username, String password) {
        loginPage.login(username,password);
    }

    @Then("user should be on Account Summary page")
    public void user_should_be_on_Account_Summary_page() {
        Assert.assertTrue("Title not matched", loginPage.verifyAccountSummary());
    }

    @Then("user should not be able to login")
    public void user_should_not_be_able_to_login() {
        Assert.assertTrue(loginPage.verifyTroubleMessageDisplayed());
    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
        Assert.assertTrue(loginPage.verifyErrorMessageDisplayed());

    }

    @And("close browser")
    public void closeBrowser() {
        Driver.get().close();
    }


    @And("user clicks on {string} tab")
    public void userClicksOnTab(String tab) {
        loginPage.navigateTo(tab);
    }
}
