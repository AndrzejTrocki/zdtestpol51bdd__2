Feature: basic calculator functions
  Scenario: adding two numbers
    Given I have a calculator
    When I add 2 and 3
    Then I should get 5
  Scenario: adding two numbers
    Given I have a calculator
    When I divide 6 by 2
    Then I should get 3
  Scenario: minus two numbers
    Given I have a calculator
    When I minus 6 by 5
    Then I should get 1