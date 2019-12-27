Feature: Account Activity

  @accountActivity1
  Scenario: Account Activity page title verification
    Given user is already on home page
    When user enters "username" and "password" and clicks Sign in button
    And user clicks on "Account Activity" tab
    Then title should be "Zero - Account Activity"
    And close browser

  @accountActivity2
  Scenario: Account Activity dropdown default option verification
    Given user is already on home page
    When user enters "username" and "password" and clicks Sign in button
    And user clicks on "Account Activity" tab
    Then dropdown default option should be "Savings"
    And close browser

  @accountActivity3
  Scenario: Account Activity dropdown options verification
    Given user is already on home page
    When user enters "username" and "password" and clicks Sign in button
    And user clicks on "Account Activity" tab
    Then dropdown options should be following items
      | Savings | Checking | Savings | Loan | Credit Card | Brokerage |
    And close browser

  @accountActivity4
  Scenario: Account Activity transaction table columns verification
    Given user is already on home page
    When user enters "username" and "password" and clicks Sign in button
    And user clicks on "Account Activity" tab
    Then transaction table columns should be following items
      | Date | Description | Deposit | Withdrawal |
    And close browser