Feature: to test tags

  @Smoke
  Scenario: scenario1
    Given "user given"
    When "user when"
    And "user and"
    Then "user then" 

 @Regression
  Scenario: scenario2
    Given "user given"
    When "user when"
    And "user and"
    Then "user then" 

 @Smoke @Regression
  Scenario: scenario3
    Given "user given"
    When "user when"
    And "user and"
    Then "user then" 

