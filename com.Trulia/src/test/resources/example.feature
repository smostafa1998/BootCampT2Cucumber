
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

  @CalculateRates
  Scenario Outline: User should be able to enter data to find houses to buy
    When user goes to buy page
    And user adds the "<location>"
    And user adds the lowPrice Range for lowPrice
    And user adds the highPrice Range for highPrice
    And user clicks the search button
    Then user finds search results

    Examples:
      | location       |
      | Boston         |
      | Maine          |
      | Hawaii         |
