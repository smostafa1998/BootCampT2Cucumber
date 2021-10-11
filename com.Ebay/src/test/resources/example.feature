
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