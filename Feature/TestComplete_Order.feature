#Author:farid
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
@sanity
Feature: To Test TestComplete Order Functionality

  Background: Successful login to weborder
    Given User is on weborder login Page
    When User Enter the userName "Tester"
    Then user enter the password "test"
    And User click on login Button
    Then user should login to the home page

  Scenario: Successful Order in TestComplete App
    And User Clicks on Order link in TestComplete
    And User enters quantity, customer name, street, city, zip, card, card number, expire date in TestComplete
    And User Click on Process Button in TestComplete
    Then User should see order success message in TestComplete
