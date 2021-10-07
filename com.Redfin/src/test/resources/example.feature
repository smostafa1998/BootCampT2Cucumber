
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
    And user adds the lowPrice Range for lowPrice
    And user adds the highPrice Range for highPrice
    And user clicks the search button
    And user reaches the website results where user clicks on table view
    Then user finds the sale name which matches the predefined "<sale name>"

    Examples:
      | location       |sale name            |
      | Boston         |Boston Homes for Sale|
      | Maine          |Maine Homes for Sale |
      | Hawaii         |Hawaii Homes for Sale|


