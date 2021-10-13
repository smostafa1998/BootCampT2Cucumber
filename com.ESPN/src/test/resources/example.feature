Feature: As a user, I should be able to navigate to the Homepage

  Background:
    Given user is at homepage

  @Homepage
  Scenario Outline: User should be able to navigate to the homepage
    When user enters the url
    Then user navigates to the Homepage

    Examples:
      | search term    | category                  |
      | Playstation 5  | Video Games & Consoles    |
      | Hand Sanitizer | Health & Beauty           |
      | iPhone 13      | Cell Phones & Accessories |

  @NFLTest
  Scenario Outline: User should be able to navigate to NFL fantasy page
    When user navigates to the nfl page from homepage
    And user clicks on the fantasy football link
    And user clicks on the create League tab
    And user sends "<input_team>" to League Name
    And user sends "<groupNum>" to Group Number
    And user sends "<scoring>" to Scoring Type
    And user clicks on the create league button
    And user sends "<email>" to the email bar
    And user sends "<password>" to the password bar
    And user clicks on the log in
    Then user tries to log in but gets error message

    Examples:
      | input_team         | groupNum | scoring | email                   | password        |
      | Sabreens Star Team | 1        | 1       | smostafa1998@gmail.com  | testing123      |
      | Golden Trio        | 2        | 2       | dfksdjfs@gmail.com      | jumpingIntoBlah |
      | PeopleNTech 2021   | 3        | 3       | yellinglol344@yahoo.com | wowowowwowo     |