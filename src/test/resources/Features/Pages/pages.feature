Feature: Validating pages module

  Scenario Outline: User verify our team module inside the pages
    Given User enter URL to navigate the website "<Url>"
    And Validating the user is on the home page
    When User clicks on Pages button
    And User clicks on Our Team button
    Then Validating user successfully navigating Our Team Page

    Examples: 
      | Url                                       |
      | https://shivohamautomation.com/index.html |
