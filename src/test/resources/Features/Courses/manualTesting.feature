      
Feature: Navigate to Manual Testing Course

  Scenario Outline: User navigates to Manual Testing from Courses dropdown
    Given the user launches the website "<url>"
    When the user clicks on the Courses button
    And the user selects Manual Testing from the dropdown
    Then the Manual Testing course page should be displayed
    
    Examples:
     | url 																														 |
     | https://darkblue-caribou-831120.hostingersite.com/about.html		 |
     
      