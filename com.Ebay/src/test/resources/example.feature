
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

  @ArtCollectionT3
  Scenario Outline: User is at ArtCollection Page and be able to search items
    When user clicks on ArtCollection the hover way
    And user clicks on one of the "<categories>"
    And user then clicks on one of the categories "<types>"
    Then user asserts the "<websiteURL>"

    Examples:
      | categories| types    |                          websiteURL                                               |
      |   1       | 1        | https://www.ebay.com/b/Art-Prints/360/bn_2311282                                  |
      |   2       | 1        | https://www.ebay.com/e/home-garden/vintage-and-new                                |
      |   4       | 2        | https://www.ebay.com/b/Collectible-Funko-Bobbleheads-1970-Now/149372/bn_3017826   |