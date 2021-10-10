
Feature: As a user, I should be able to navigate to the Homepage

  Scenario: User should be able to build his own vehicle
    When user enters the url
    Then user navigates to the Homepage
    And i want to build my own
    Then i should navigate building page
    And i want select vehicle type
    Then i navigate to the selected vehicle page
   And i want select vehicle model
   And i go to summary
   And i click get your quote
 # Then i navigate to the driver information page
