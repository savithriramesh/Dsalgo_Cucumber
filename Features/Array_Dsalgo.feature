
@array
Feature: Array

		Background:
		Given Launch chrome Browser
    When User Opens URL "https://dsportalapp.herokuapp.com"
    When Click on Getstarted Button
    When Click on Sigin
    And User Enters Login data as in 3
    When Click on LoginButton
    Then Click on Getstarted Button in Array
    Then The user be directed to "ARRAY" Page
    
	@array_pyn 
	Scenario: View on Array in Python
		When Click on Arrays in Python Link
		Then The user redirected to "Arrays in Python" page
  	And  Click on Try Here Link
  	Then The user redirected to "TryEditor" page
  	And Enter a python code in try editor box
  	When Click on Run button
  	And close the browser
  	
  @using_list 
	Scenario: View on Array Using List
		When Click on Arrays Using List Link
		Then The user redirected to "Arrays Using List" page
  	And  Click on Try Here Link
  	Then The user redirected to "TryEditor" page
  	And Enter a python code in try editor box
  	When Click on Run button
  	And close the browser
  	
  @Operation_list 
	Scenario: View on basic operation list
		When Click on Basic Operations in Lists
		Then The user redirected to "Basic Operation" page
  	And  Click on Try Here Link
  	Then The user redirected to "TryEditor" page
  	And Enter a python code in try editor box
  	When Click on Run button
  	And close the browser
  	
  @Applications_array  
	Scenario: View on applications of array
		When Click on Applications of Array
		Then The user redirected to "Applications of array" page
  	And  Click on Try Here Link
  	Then The user redirected to "TryEditor" page
  	And Enter a python code in try editor box
  	When Click on Run button
  	And close the browser
	
	
	@practice_que
	Scenario: View on practice questions
		When Click on Arrays in Python Link
		When Click on Practice Questions
		When Click on Search the array
 		And close the browser
 		
 		
 	@max_consecutive
	Scenario: View on max consecutive
		When Click on Arrays in Python Link
		When Click on Practice Questions
		When Click on Max consecutive ones
 		And close the browser
 		
 	@find
	Scenario: View on find numbers with even numbers of digits
		When Click on Arrays in Python Link
		When Click on Practice Questions
		When Click on find numbers with even numbers of digits
 		And close the browser
 		
 	@square
	Scenario: View on Click on square of sorted array
		When Click on Arrays in Python Link
		When Click on Practice Questions
		When Click on square of sorted array
 		And close the browser
 