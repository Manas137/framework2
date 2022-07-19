# Parameterization and data driven
Feature: feature to test login functionality with parameter

  Scenario Outline: Check login is succesfull with valid credentials
    Given user is on login page
    When user enter <username> and <password>
    And cick on login button
    Then user is navigate to home page and <country>

    Examples: 
      | username | password | country |
      | sagar    |    12345 | India   |
      | manas    |    12345 | Brazil  |
