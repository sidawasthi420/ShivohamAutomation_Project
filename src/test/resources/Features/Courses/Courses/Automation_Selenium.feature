Feature: Validate Courses Feature

  Scenario Outline: User verify Selenium section inside Automation.
    Given navigate to the url "<URL>"
    When User click on Courses section
    Then user select on Automation section from dropdown
    When user click on Selenium
    Then user is on Selenium Automation Testing page is displayed.
    And user scroll down and click Enroll now button
    And the user enter the "<Full_Name>"
    And the user enter the "<Email_Address>"
    And the user enter the "<Phone_Number>"
    And the user enter the "<Select_Course>"
    And the user enter the "<Preferred_Start_Date>"
    And the user click on Register now

    Examples: 
      | URL                             | Full_Name   | Email_Address            | Phone_Number | Select_Course | Preferred_Start_Date |
      | https://shivohamautomation.com/ | Richa Verma | richabiotech89@gmail.com |  08920357992 | Selenium      | 18-05-2025           |
 