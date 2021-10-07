
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
    When user goes to mortage page
    And user clicks on the affordability calculator
    And user enters the "<annual_income>" info for annual income
    And user enters the "<down_payment_info>" info for down payment
    And user enters the  "<other_monthly_debts>" info for other debts
    And user enters their "<zip_code>"
    Then user finds "<search_results>"

    Examples:
      | annual_income  |  down_payment_info | other_monthly_debts| zip_code | search_results|
      | 100000         |     30000          |     400            | 11377    |   $431,833    |
      | 300000         |     100000         |     1000           | 11794    |  $1,333,695   |
      | 170000         |     70000          |     8000           | 02111    |   -$414,714   |
