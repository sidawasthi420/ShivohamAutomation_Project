Feature: Navigate to Core JAVA Course

  Scenario Outline: User navigates to Core JAVA from Courses dropdown and registers for the course
    Given the user launches the website "<url>"
    And the user is on the Home page
    When the user clicks on the Courses button
    And the user selects Core JAVA from the dropdown
    Then the Core JAVA course page should be displayed
    And the user clicks on the Enroll Now button
    And the user enters Full Name as "<fullName>"
    And the user enters Email Address as "<email>"
    And the user enters Phone Number as "<phone>"
    And the user selects Course as "<course>"
    And the user selects Preferred Start Date as "<startDate>"
    And the user submits the registration form
    Then the user should see pop-up with the message "Thank you for registering! Our team will reach you for further process."
    And the user accept the alert

    Examples: 
      | url                             | fullName    | email                    | phone      | course          | startDate  |
      | https://shivohamautomation.com/ | Tariq Ahmad | tariqahmad8057@gmail.com | 9258678692 | API Testing     | 01-05-2025 |
      | https://shivohamautomation.com/ | Tariq       | tariqahmad@gmail.com     | 9027482232 | Core JAVA       | 02-06-2025 |
      | https://shivohamautomation.com/ | Ahmad       | tariq57@gmail.com        | 9027588892 | Manual Testing  | 22-08-2025 |


# Feature: Navigate to a Course and Register

#   Scenario Outline: User navigates to a course from the Courses dropdown and registers for it
#     Given the user launches the website "<url>"
#     And the user is on the Home page
#     When the user clicks on the Courses button
#     And the user selects "<courseName>" from the dropdown
#     Then the "<courseName>" course page should be displayed
#     And the user clicks on the Enroll Now button
#     And the user enters Full Name as "<fullName>"
#     And the user enters Email Address as "<email>"
#     And the user enters Phone Number as "<phone>"
#     And the user selects Course as "<course>"
#     And the user selects Preferred Start Date as "<startDate>"
#     And the user submits the registration form
#     Then the user should see pop-up with the message "Thank you for registering! Our team will reach you for further process."
#     And the user accept the alert

#     Examples:
#       | url                             | courseName      | fullName    | email                    | phone      | course          | startDate  |
#       | https://shivohamautomation.com/ | Manual Testing  | Tariq Ahmad | tariqahmad8057@gmail.com | 9258678692 | API Testing     | 01-05-2025 |
#       | https://shivohamautomation.com/ | Core JAVA       | Tariq       | tariqahmad@gmail.com     | 9027482232 | Core JAVA       | 02-06-2025 |
#       | https://shivohamautomation.com/ | API Testing     | Ahmad       | tariq57@gmail.com        | 9027588892 | Manual Testing  | 22-08-2025 |
