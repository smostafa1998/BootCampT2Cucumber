
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


  @Decor
  Scenario Outline: User should be able to navigate to the decor page and search items
    When user navigates to the decor page from homepage
    And user clicks on the decor advice page
    And user sends a "<search term>" to the search bar
    And user clicks on the search button
    And user clicks on the first article on the page
    Then user checks if "<title>" of the article is asserted

    Examples:
      | search term    |           title                                      |
      | wall paper     | How to Style Dining Room Wallpaper                   |
      | paintings      | French Country Living Room Ideas                     |
      | couches        | Best Sectional Sofas & Couches for Small Spaces      |


  @DecorT2
  Scenario Outline: User should be able to navigate to the decor page and log in but fail
    When user navigates to the decor page from homepage
    And user clicks on account buttons
    And user sends a "<email>" to the email bar
    And user sends a "<password>" to the password bar
    Then user clicks to sign in but fails

    Examples:
      | email                 | password    |
      | smostafa1998@gmail.com| testing123  |
      | john2345@gmail.com    | applebottom |
      | alex3453@gmail.com    | lmaorandom  |