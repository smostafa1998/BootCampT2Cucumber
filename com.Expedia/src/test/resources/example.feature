
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





