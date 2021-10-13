
Feature: As a user, I should be able to navigate to the Homepage

  Scenario: login and log out from my account
  And i want to login to my account
  And i enter username and password
    And i click login
  Then i should see my team box is displayed
  And i want to log off
  Then i should navigate back to homepage
