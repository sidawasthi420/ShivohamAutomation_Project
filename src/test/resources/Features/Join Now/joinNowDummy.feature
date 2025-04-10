Feature: Contact a company for course details

    Scenario: User contacts the company to inquire about course details
        Given the user is on the company's contact page
        When the user fills in the contact form with valid details
            | Name       | Email             | Message                      |
            | John Doe   | john.doe@email.com | I would like to know more about your courses. |
        And the user submits the form
        Then the user should see a confirmation message saying "Your inquiry has been sent successfully."