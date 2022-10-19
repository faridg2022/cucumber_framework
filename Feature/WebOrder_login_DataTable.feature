#Author: farid
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
Feature: To Test WeBorder Login functionality with multiple value

  Scenario Outline: Successful Login with multiple Valid Credentials
    #Scenario: Successful Login with Valid Credentials
    Given User is on weborder home Page
    When User enters "<Username>" and "<Password>"
    And User click on Login button of Weborder
    Then User should be in Home page and Logout button should display

    Examples: With Multiple Data
      | Username | Password |
      | Tester   | test     |
      | Tester   | test     |
      | Tester   | test     |
