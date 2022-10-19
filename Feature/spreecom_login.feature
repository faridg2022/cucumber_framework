
@sanity
Feature: spreecom login functionality

  Scenario: successful login to spreecom
    Given User is on demo.spreecom.org
    When User click on the user icon
    Then User click on login button
    When User should be taken to the login page
    Then User enter valid email "farid@spree.com"
    And User enter valid password "selenium"
    Then User click on login submit button
    When User should be ended in the home page with wlcome message
