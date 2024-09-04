Feature: Facebook Login page
	Scenario: Facebook Login Title
		Given Login page is displayed
		Then Login page title is displayed
		And Close Browser

	Scenario: Facebook Login Functionality
		Given Login page is displayed
		When User logs in
		Then Home page is displayed
		And Close Browser