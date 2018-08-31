Feature: Example Feature file for Stackoverflow

  Scenario: Answer the question
    Given question asked
    When answered correctly
    Then mark as accepted

  Scenario: Failing scenario
    Given question asked
    When something went wrong
    Then fail scenario