@tag
Feature: Stack


		Scenario:Login
		Given Launch chrome Browser
    When User Opens URL "https://dsportalapp.herokuapp.com"
    When Click on Getstarted Button
    When Click on Sigin
    And User Enters Login data as in 3
    When Click on LoginButton
    Then Click on Getstarted Button in Stack
    Then The user be directed to "stack" Page
    
    
  @stack 
	Scenario: View on stack page
		When Click on Operations in Stack
  	And  Click on Try Here Link
  	Then The user redirected to "TryEditor" page
  	And Enter a python code in try editor box
  	When Click on Run button
  	Then Go back to previous page


	@implemention 
	Scenario: View on Implementation page
		When Click on Implementation
  	And  Click on Try Here Link
  	And Enter a python code in try editor box
  	When Click on Run button
  	Then Go back to previous page
  	
  @application 
	Scenario: View on app page
		When Click on Applications
  	And  Click on Try Here Link
  	And Enter a python code in try editor box
  	When Click on Run button
  	Then Go back to previous page
  	
  @prac_ques 
	Scenario: View on practice question page
		When Click on Practice Questions
  	And close the browser
  
