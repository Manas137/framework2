Feature: Searching for Capgemini and Accenture

  @Capgemini
  Scenario: check google search with chrome
    Given user is in google page
    When user searches for search
    Then user close the browser
	
	 @Accenture
  Scenario: check google search with mozilla
    Given user is in google page
    When user searches for search
    Then user close the browser
	