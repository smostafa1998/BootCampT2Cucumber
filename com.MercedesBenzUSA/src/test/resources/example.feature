
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

  @ShoppingPage
  Scenario Outline: User should be able to navigate to the homepage
    When user enters the shopping page
    And user clicks on the estimate payment button
    And user clicks on the budget tab
    And user enters in the "<monthly_payment>" information
    And user clicks on the "<year>" dropdown for the car year
    And user clicks on the "<term>" dropdown for the car
    And user enters the "<down_payment_info>" information for the down payment
    And user clicks on find vehicles
    Then user sees the results sheet for the cars with the "<num_of_vehicles>"

    Examples:
      | monthly_payment|down_payment_info | term | year| num_of_vehicles         |
      | 50000          |  1000            | 48   | 2021| Viewing 0 of 0 vehicles |
      | 100000         |  2000            | 36   | 2021| Viewing 0 of 0 vehicles |
      | 70000          |  3500            | 24   | 2020| Viewing 0 of 0 vehicles |

