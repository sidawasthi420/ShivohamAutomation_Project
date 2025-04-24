# Feature: Navigate to API Testing Course

#   Scenario Outline: User navigates to API Testing from Courses dropdown and registers for the course
#     Given the user launches the website "<url>"
#     And the user is on the Home page
#     When the user clicks on the Courses button
#     And the user selects API Testing from the dropdown
#     Then the user selects "<subCourse>" from the sub-dropdown
#     Then the API Testing course page should be displayed
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
#       | url                             | subCourse                    | fullName    | email                    | phone      | course         | startDate  |
#       | https://shivohamautomation.com/ | API Testing - soapUI         | Tariq Ahmad | tariqahmad8057@gmail.com | 9258678692 | API Testing    | 01-05-2025 |
#       | https://shivohamautomation.com/ | API Testing - postman        | Tariq       | tariqahmad@gmail.com     | 9027482232 |

      
# Feature: Navigate to API Testing Course

#   Background: 
#     Given the user launches the website "<url>"
#     And the user is on the Home page
#     When the user clicks on the Courses button
#     And the user selects API Testing from the dropdown
      
#   Scenario Outline: Register for sub-course and fill form
#     Then the user selects "<subCourse>" from the sub-dropdown
#     Then the API Testing course page should be displayed
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
#       | url                             | subCourse                    | fullName    | email                    | phone      | course         | startDate  |
#       | https://shivohamautomation.com/ | API Testing - soapUI         | Tariq Ahmad | tariqahmad8057@gmail.com | 9258678692 | API Testing    | 01-05-2025 |
#       | https://shivohamautomation.com/ | API Testing - postman        | Tariq       | tariqahmad@gmail.com     | 9027482232 | Core JAVA      | 02-06-2025 |
#       | https://shivohamautomation.com/ | API Automation - restAssured | Ahmad       | tariq57@gmail.com        | 9027588892 | Manual Testing | 22-08-2025 |

    
Feature: Navigate to API Testing Course

  Background: 
    And the user is on the Home page
    When the user clicks on the Courses button
    And the user selects API Testing from the dropdown

  Scenario Outline: Register for sub-course and fill form
    Given the user launches the website "<url>"
    Then the user selects "<subCourse>" from the sub-dropdown
    Then the API Testing course page should be displayed
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
      | url                             | subCourse                    | fullName    | email                    | phone      | course         | startDate  |
      | https://shivohamautomation.com/ | API Testing - soapUI         | Tariq Ahmad | tariqahmad8057@gmail.com | 9258678692 | API Testing    | 01-05-2025 |
      | https://shivohamautomation.com/ | API Testing - postman        | Tariq       | tariqahmad@gmail.com     | 9027482232 | Core JAVA      | 02-06-2025 |
      | https://shivohamautomation.com/ | API Automation - restAssured | Ahmad       | tariq57@gmail.com        | 9027588892 | Manual Testing | 22-08-2025 |
    