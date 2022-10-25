Feature: Validate Appointments
@VerifyHospital @Regression
Scenario: Verify 1st hospital
	Given Data "411001" and "16-09-2022" is present
	When user calls "FindByPin" with "GET" http request
	Then the API call got success with status code "200"
	And verify first hospital is "RurP/PCNT/Usha Nursing Home" hospital
	
@VerifyHospital @Regression
Scenario: Verify 1st hospital
	Given Data "411001" and "16-09-2022" is present
	When user calls "FindByPin" with "GET" http request
	Then the API call got success with status code "200"
	And verify first hospital is "RurP/PCNT/Usha Nursing Home" hospital
	
	
@VerifyHospital @Regression
Scenario: Verify 1st hospital
	Given Data "411001" and "16-09-2022" is present
	When user calls "FindByPin" with "GET" http request
	Then the API call got success with status code "204"
	And verify first hospital is "RurP/PCNT/Usha Nursing Home" hospital
	
	
@VerifyHospital @Regression
Scenario: Verify 1st hospital
	Given Data "411001" and "16-09-2022" is present
	When user calls "FindByPin" with "GET" http request
	Then the API call got success with status code "200"
	And verify first hospital is "RurP/PCNT/Usha Nursing Home" hospital