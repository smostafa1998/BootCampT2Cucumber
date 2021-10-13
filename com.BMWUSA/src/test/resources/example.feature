
Feature: As a user, I should be able to navigate to the Homepage

  Scenario: User should be able to build his own vehicle
    When user enters the url
    Then user navigates to the Homepage

    Examples:
      | search term    |           category              |
      | Playstation 5  |      Video Games & Consoles     |
      | Hand Sanitizer |        Health & Beauty          |
      | iPhone 13      |    Cell Phones & Accessories    |

  @ShoppingPage
  Scenario Outline: User should be able to navigate to the homepage
    When user navigates to the the shopping tab
    And user clicks on the estimate payment button
    And user selects from the dropdown menu for "<car_series>"
    And user selects from the dropdown menu and picks "<car_model>"
    And users enters in their "<zip_code>"
    And user clicks on the estimate button to see
    Then user receives the "<year>" of the car

    Examples:
      | car_series |  car_model | zip_code| year|
      | 2          |   222V     | 11377   | 2022|
      | 7          |   227N     | 90011   | 2022|
      | 4          |   224E     | 04005   | 2022|
