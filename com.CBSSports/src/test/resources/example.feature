Feature: As a user, I should be able to navigate to the Homepage

  Background:
    Given user is at homepage

  Scenario: login and log out from my account
    And i want to login to my account
    And i enter username and password
    And i click login
    Then i should see my team box is displayed
    And i want to log off
    Then i should navigate back to homepage

  @Homepage
  Scenario Outline: User should be able to navigate to the homepage
    When user enters the url
    Then user navigates to the Homepage

    Examples:
      | search term    | category                  |
      | Playstation 5  | Video Games & Consoles    |
      | Hand Sanitizer | Health & Beauty           |
      | iPhone 13      | Cell Phones & Accessories |

  @SoccerShopping
  Scenario Outline: User is in soccer page and navigates to shopping page to buy item
    When user navigates to the soccer page from homepage
    And user clicks on the dot dot dot button
    And user clicks on the shop link soccer button
    And user picks on one of the "<soccer_team>" links
    And user clicks on one of the "<products>"
    Then user will find the "<item_name>" from that soccer team


    Examples:
      | soccer_team | products | item_name                                                                     |
      | 8           | 1        | Ireland National Team New Era Tonal Rubber Logo 9FORTY Adjustable Hat - Green |
      | 6           | 5        | France National Team Nike Full-Zip Parka Jacket - Black/Red                   |
      | 9           | 4        | Italy National Team Puma Youth 2021/22 Away Replica Jersey - White/Navy       |

