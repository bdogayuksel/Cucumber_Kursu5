Feature: Citizenship Functionality

  Background:

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario Outline: Create a citizenship
    And Navigate to citizenship page
    When User a CitizenShip name as "<name>" short name as "<short>>"
    Then Success message should be displayed

    When User a CitizenShip name as "<name>" short name as "<short>"
    Then Already exist message should be displayed

    When User delete the "<name>"
    Then Success message should be displayed

    #scenario outline sayesinde alttakiler çalıştı
    Examples:
      | name       | short      |
      | beUlk12357  | doUlk1355   |
      | beUlk4123 | doUlk8456   |
      | beUlk35322  | doUlk33444  |
      | beUlk435341 | doUlk435351 |
