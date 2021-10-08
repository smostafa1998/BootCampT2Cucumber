
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

  @BuyHousesHomePage
  Scenario Outline: User should be able to enter data to find houses to buy
    When user goes to buy page
    And user adds the "<location>"
    And user adds the "<lowPrice>" for low price Range
    And user adds the "<highPrice>" for high price Range
    And user clicks the search button
    And user reaches the website results where user clicks on table view
    Then user finds the sale name which matches the predefined "<sale name>"

    Examples:
      | location       |sale name            | lowPrice | highPrice|
      | Boston         |Boston Homes for Sale| $100k    | $200k    |
      | Maine          |Maine Homes for Sale | $100k    | $200k    |
      | Hawaii         |Hawaii Homes for Sale| $100k    | $200k    |


