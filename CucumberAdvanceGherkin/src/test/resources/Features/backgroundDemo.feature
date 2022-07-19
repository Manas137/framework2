Feature: check home page functionality

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is navigate to home page

  Scenario: check logout functionality
    #Given user is logged in
    When user click on welcome link
    Then logout link is displayed

  Scenario: verify quick lunch toolbar is present
    #Given user is logged in
    When user click on dashboard link
    Then quick lunch toolbar is displayed
