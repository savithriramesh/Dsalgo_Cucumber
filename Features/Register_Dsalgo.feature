@tag
Feature: Register

  @tag1
  Scenario Outline: Validate Register page
   	Given Launch chrome Browser
    When User Opens URL "https://dsportalapp.herokuapp.com"
    When Click on Getstarted Button
    When Click on Register
  	Then The user should be redirected to Register form
  	And  Enter Username Password and Confirm password <rowindex>
    When Click on Register Button
  	Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as " username <rowindex>
  	When Click on signout
  	Then "Logged out successfully" is displayed
  	  Examples: 
      | rowindex  |  
      | 1 | 
      | 2 | 
      | 3 | 
