Feature: Web Login with multiple data
  @datadriven
  Scenario Outline: Attempt login with specific credentials
    Given navigate to the url "<url>"
    Then validate that user is on home page
    When user clicks on about link
    Then the user should get navigated to about page

    Examples:
     | url 																														 |
     | https://lawngreen-butterfly-429189.hostingersite.com/index.html |