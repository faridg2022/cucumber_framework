Feature: add address on spreecom

  Background: successful login to spreecom
    Given User is on demo.spreecom.org
    When User click on the user icon
    Then User click on login button
    When User should be taken to the login page
    Then User enter valid email "farid@spree.com"
    And User enter valid password "selenium"
    Then User click on login submit button
    When User should be ended in the home page with wlcome message
  

  Scenario: add address successfully
    Given User click on add new address
    When User is presenting a form to complete
    Then User enter first name, last name, address, city,state, zip code, coutnry, phone
    And User click on save button
    When User should be successfully created address and see message new addres has been created
