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
    Then User should get proper "<ExpectedResult>"

    Examples: With Multiple Data
      | Username | Password | ExpectedResult             |
      | Tester   | test1    | Invalid Login or Password. |
      | Tester1  | test     | Invalid Login or Password. |
      |          | test     | Invalid Login or Password. |
      | Tester   | test     | Logout                     |
