#Author: Farid
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
Feature: weborder login

  @smoke
  Scenario: Successful login to weborder
    Given User is on weborder login Page
    When User Enter the userName "Tester"
    Then user enter the password "test"
    And User click on login Button
    Then user should login to the home page

  Scenario: Successful LogOut
    When User click on the logout button
    Then User should be taken back to the login page
