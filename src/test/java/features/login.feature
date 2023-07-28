@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with preconditionasdasdas
    And some other preconditiondasdasdasd
    When I complete actionasdasdasdas
    And some other actionasdasdasd
    And yet another actionasdasedasd
    Then I validate the outcomessdasdasdasdasdasdasdas
    And check more 

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
