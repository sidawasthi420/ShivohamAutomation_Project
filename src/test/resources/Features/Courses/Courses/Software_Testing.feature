Feature: Validate Courses Feature

    Background:Open browser and naviagte to url
     Given navigate to the url "https://shivohamautomation.com/"
     @sanity @richa
    Scenario Outline:  
    User verify Complete Software Testing section inside courses
    When user clicks on course link
    When user navigate on Complete Software Testing
    Then validate that user sucessesful navigate on Complete Software Testing section

    
 Examples:
   |url                                             |
   |https://shivohamautomation.com/|