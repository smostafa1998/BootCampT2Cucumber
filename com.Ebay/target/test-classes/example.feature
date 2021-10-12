
Feature: As a user, I should be able to navigate ebay and check my cart

  Scenario: validate en empty cart if you don't add an item
     Given user is at homepage
     When user enters the url
     Then user navigates to the Homepage
     And search for women clothing
     And click on search box
     And i should  see women cloth displayed in home page
     And i select dresses
     And i click cart
     Then i should see no items in cart message displayed
     And i click start shopping
     Then i should navigate back to shopping page





