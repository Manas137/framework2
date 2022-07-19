Feature: feature to test login functionaliity

  Scenario: check login is succesful with valid credentials
    Given User is on login page
    When User enters username and password
    And Click on login button
    Then User is navigate the home page

  
