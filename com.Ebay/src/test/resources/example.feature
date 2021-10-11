
Feature: As a user, I should be able to navigate to the Homepage

  Background:
    Given user is at homepage

  @ArtCollectionT1
  Scenario Outline: User is at ArtCollection Page and be able to search items
    When user clicks on ArtCollection button
    And user enters a "<search term>" in the search Bar
    And user selects a "<category>" from the All categories
    And user clicks the search button
    Then user is shown results in the art page and "<search term>" is shown

    Examples:
      | search term    | category  |
      | marvel         |   550     |
      | barbies        |   267     |
      | van gogh       |  11450    |

  @ArtCollectionT2
  Scenario Outline: User is at ArtCollection Page and be able to search items
    When user clicks on ArtCollection the other way
    And user clicks on the sell something button
    And user clicks on the popular featured button
    And user selects a video game from the category list
    And user clicks on the "<condition>" state
    And user clicks on the "<publisher>" brand name
    And user then clicks on the "<game_name>" game name
    And user then clicks on the "<platform>" platform name
    And user then clicks on the "<genre>" genre name

    Examples:
       | condition| publisher| game_name | platform    |genre |
       |   2      | 1        | Wii Sports| Nintendo Wii|Sports|

