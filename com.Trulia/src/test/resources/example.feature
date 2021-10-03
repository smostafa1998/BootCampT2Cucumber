
Feature: As a user, I should be able to navigate to the Homepage

  Background:
    Given user is at homepage

  @Homepage
  Scenario Outline: User should be able to navigate to the homepage
    When user enters the url
    Then user navigates to the Homepage

    Examples:
      | search term    |           category              |
      | Playstation 5  |      Video Games & Consoles     |
      | Hand Sanitizer |        Health & Beauty          |
      | iPhone 13      |    Cell Phones & Accessories    |