Feature: Validate Repository Actions
@CreateRepository @Regression
Scenario Outline: Create new Repository is created for an authenticated user
	Given new repository details with "<name>" "<description>" are available
	When "CreateRepository" with "POST" HTTPS request is called
	Then response status code "201"
	And "name" in response body is "<name>"
	And Save repository ID
	
	
Examples:
	|name		|description		|
	|RestAPI	|via Automation		|

	
	