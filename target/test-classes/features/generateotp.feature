Feature: Validating OTP is generated
@GenerateOTP @Regression
Scenario Outline: Generate OTP
	Given Add Payload with "<mobile>"
	When user calls "GenerateOTP" with "POST" http request
	Then the API call got success with status code "200"
	
Examples:
	|mobile 	|
	|8793590256	|
	|1			|