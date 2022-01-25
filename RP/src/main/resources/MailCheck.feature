Feature: Yahoo work check

  Background:
    Given I opened yahoo

  Scenario Outline: Check sent message
    When I entered account
    And I write a letter
    And I save a message
    And I send a message
    Then Message with body "<body>" is into sends
    And Exit from account

    Examples:
    |body|
    |Hello max|


