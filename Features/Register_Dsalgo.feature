@tag
Feature: Register

  @tag1
  Scenario: User Open Register page
    Given Launch chrome Browser
    When User Opens URL "https://dsportalapp.herokuapp.com"
    When Click on Getstarted Button
    When Click on Register
  	Then The user should be redirected to Register form

	Scenario: user register with username and password
    Given Launch chrome Browser
    When User Opens URL "https://dsportalapp.herokuapp.com"
    When Click on Getstarted Button
    When Click on Register
    When Click on Register Button
  	Then The user should be redirected to Register form
  	
  	Scenario Outline:
    Given Launch chrome Browser
    When User Opens URL "https://dsportalapp.herokuapp.com"
    When Click on Getstarted Button
    When Click on Register
    And  Enter Username Password and Confirm password <rowindex>
    When Click on Register Button
  	Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as <username>"
  	
  	  Examples: 
      | rowindex  |  
      | 1 | 