Feature: Validating pages module

  Scenario Outline: User verify our team module inside the pages
    Given User enter URL to navigate the website "<Url>"
    And Validating the user is on the home page
    When User clicks on Pages button
    And User clicks on Our Team button
    Then Validating user successfully navigating Our Team Page
    And team member profile should be visible
    And Each team member should have a name and designation
    Then Social Media icon should be visible "<SocialMedia>"
    And All social media icon should contain valid link each Team member profile  "<SocialMedia>"
    And User clicks on the Enroll Now link
    Then User Enters Name "<Full_Name>" in join Now form
    And User Enters email "<Email_Address>" in join Now form
    And User Enters Phone number  "<Phone_Number>" in join Now form
    And User Select course "<Select_Course>" in join Now form
    And User Select date "<Preferred_Start_Date>" in join Now form
    And User clicks on submit button

    Examples: 
      | Url                             | SocialMedia | Full_Name | Email_Address | Phone_Number | Select_Course | Preferred_Start_Date |
      | https://shivohamautomation.com/ | Facebook    | sangeeta  | abcd@shff.in  |   7676767586 | Automation    | 10-05-2025           |
      | https://shivohamautomation.com/ | Twitter     | sangeeta  | abcd@shff.in  |   7676767586 | Automation    | 10-05-2025           |
      | https://shivohamautomation.com/ | Instagram   | sangeeta  | abcd@shff.in  |   7676767586 | Automation    | 10-05-2025           |
