package com.zerobank.stepdefinitions;
import com.zerobank.pages.AddNewPayeePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class AddNewPayeePageStepDefinitions {
    AddNewPayeePage addNewPayeePage=new AddNewPayeePage();

    @Given("user is already on Add New Payee page")
    public void userIsAlreadyOnAddNewPayeePage() {
        addNewPayeePage.clickAddNewPayeeTab();
    }

    @When("user creates new payee using following information")
    public void user_creates_new_payee_using_following_information(Map<String,String> userData) {
        addNewPayeePage.addNewPayee(userData.get("Payee Name"), userData.get("Payee Address"), userData.get("Account"),userData.get("Payee details"));
    }

    @Then("message {string} should be displayed")
    public void message_should_be_displayed(String expectedMessage) {
        String actualMessage=addNewPayeePage.verifyMessage();
        Assert.assertEquals("Confirmation message not matched", expectedMessage, actualMessage);
    }

}