Feature: Web Login with multiple data

	Background: Open the browser and navigate to Url
		Given navigate to the url "<url>"
    Then validate that user is on home page
    When user clicks on about link
    
  @datadriven
  Scenario Outline: Attempt login with specific credentials
    Then the user should get navigated to about page

    Examples:
     | url 																														 |
     | https://lawngreen-butterfly-429189.hostingersite.com/index.html |
     
     
   @datadriven
  Scenario Outline: Attempt login with specific credentials
    Then the user should get navigated to about page

    Examples:
     | url 																														 |
     | https://lawngreen-butterfly-429189.hostingersite.com/index.html |
     
     
   @datadriven
  Scenario Outline: Attempt login with specific credentials
    Then the user should get navigated to about page

    Examples:
     | url 																														 |
     | https://lawngreen-butterfly-429189.hostingersite.com/index.html |