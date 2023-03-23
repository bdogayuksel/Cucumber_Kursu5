Feature: Country Multi Scenarios

  Background:

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to country page


  Scenario: Create country

    When create a country
    Then Success message should be displayed

  Scenario: Create another country

    When create a country name as "ismUlk98" code as "is112"
    Then Success message should be displayed