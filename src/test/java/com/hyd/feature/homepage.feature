Feature: Facebook Home Page

  Scenario: Home Page Title
    Given Login page is displayed
    When User logs in
    Then Home page is displayed
    And Close Browser
    
  Scenario: Navigation to Friends Page
    Given Login page is displayed
    When User logs in
    Then Home page is displayed
    When User navigates to friends page
    Then Friends page is displayed
    And Close Browser