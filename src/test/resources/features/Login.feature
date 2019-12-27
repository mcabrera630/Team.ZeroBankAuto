@login
Feature: Login
  @login1
  Scenario: User should be able to login with valid credential
    Given user is already on home page
    When user enters "username" and "password" and clicks Sign in button
    Then user should be on Account Summary page
    And close browser

  @login2
  Scenario: User should not be able to login with invalid credential
    Given user is already on home page
    When user enters "abc" and "def" and clicks Sign in button
    Then user should not be able to login
    And error message should be displayed
    And close browser

  @login3
  Scenario: User should not be able to login with blank credential
    Given user is already on home page
    When user enters "" and "" and clicks Sign in button
    Then user should not be able to login
    And error message should be displayed
    And close browser