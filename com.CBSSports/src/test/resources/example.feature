
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

  @SoccerShopping
  Scenario Outline: User is in soccer page and navigates to shopping page to buy item
    When user navigates to the soccer page from homepage
    And user clicks on the dot dot dot button
    And user clicks on the shop link soccer button
    And user picks on one of the "<soccer_team>" links
    And user clicks on one of the "<products>"
    Then user will find the "<item_name>" from that soccer team


    Examples:
      | soccer_team  |products|                           item_name                                          |
      |      8       |   1    |Ireland National Team New Era HD Logo A-Frame 39THIRTY Flex Hat - Green       |
      |      6       |   5    |France National Team Nike Supporter Soccer Ball                               |
      |      9       |   4    |Italy Personalized Name & Number T-Shirt - Black                              |