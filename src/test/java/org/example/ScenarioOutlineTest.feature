@scenarionOutline
Feature: Implementing scenario outline

  Scenario Outline: Implementing scenario outline
    Given I load the url
    And I wait for 2 seconds
    When Enter the search text "<SearchText>"
    And I wait for 2 seconds
    Then Clicked on the Google image
    And I wait for 2 seconds
    And Click on the Search button
    And I wait for 2 seconds
    And I close the browser
    Examples:
      | SearchText            |
      | Insurity              |
      | Experion Technologies |
