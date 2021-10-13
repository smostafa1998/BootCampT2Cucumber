
Feature: As a user, I should be able to navigate to the Homepage

  Background:
    Given user is at homepage

  @Homepage
  Scenario:User should be able to navigate to the homepage
    When user enters the url
    Then user navigates to the Homepage
    And i go to home loans
    And i should see Mortgages
    And i should see Refinance
    And i should see Home Equity