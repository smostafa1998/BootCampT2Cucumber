
Feature: As a user, I should be able to navigate Expedia homepage

  Scenario: look to rent a car
    Given user is at homepage
    When user enters the url
    Then user navigates to the Homepage
    And i select car
    And i enter the pick up location
    And i enter the drop off location
    And i select pick up date and drop off date
  And i click done to confirm date
   And i select pick up time
   And i select drop off time
   And i click search

    Examples:
      | search term    |           category              |
      | Playstation 5  |      Video Games & Consoles     |
      | Hand Sanitizer |        Health & Beauty          |
      | iPhone 13      |    Cell Phones & Accessories    |


  @Flights
  Scenario Outline: User should be able to navigate to the homepage
    When user enters the url
    And user navigates from the home page to the flight page
    And user enters the "<origin>" location to the origin flight bar
    And user enters the "<destination>" location to the destination flight bar
    And user enters the "<starting_date>" to the starting date bar
    And user enters the "<ending_date>" to the ending date bar
    And user clicks on the search button
    Then user confirms on the first flight

    Examples:
      | origin    | destination | starting_date | ending_date |
      | nyc       | croatia     |  Nov 12, 2021 | Nov 14, 2021|
      | boston    | paris       |  Oct 30, 2021 | Nov 2, 2021 |
      | california| italy       |  Oct 20, 2021 | Oct 23, 2021|

