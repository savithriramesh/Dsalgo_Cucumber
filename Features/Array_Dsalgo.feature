Feature: Array

		@array
		Scenario:Login
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
  	Then Go back to previous page
  	
  @using_list 
	Scenario: View on Array Using List
		When Click on Arrays Using List Link
		Then The user redirected to "Arrays Using List" page
  	And  Click on Try Here Link
  	Then The user redirected to "TryEditor" page
  	And Enter a python code in try editor box
  	When Click on Run button
  	Then Go back to previous page
  	
  @Operation_list 
	Scenario: View on basic operation list
		When Click on Basic Operations in Lists
		Then The user redirected to "Basic Operation" page
  	And  Click on Try Here Link
  	Then The user redirected to "TryEditor" page
  	And Enter a python code in try editor box
  	When Click on Run button
  	Then Go back to previous page
  	
  @Applications_array  
	Scenario: View on applications of array
		When Click on Applications of Array
		Then The user redirected to "Applications of array" page
  	And  Click on Try Here Link
  	Then The user redirected to "TryEditor" page
  	And Enter a python code in try editor box
  	When Click on Run button
  	Then Go back to previous page
	
	
	@practice_que
	Scenario: View on practice questions
		When Click on Arrays in Python Link
		When Click on Practice Questions
		When Click on Search the array
 		Then Go back to previous page
 		
 		
 	@max_consecutive
	Scenario: View on max consecutive
		When Click on Max consecutive ones
 		Then Go back to previous page
 		
 	@find
	Scenario: View on find numbers with even numbers of digits
		When Click on find numbers with even numbers of digits
 		Then Go back to previous page
 		
 	@square
	Scenario: View on Click on square of sorted array
		When Click on square of sorted array
 		Then Go back to previous page
 		
 			@square
		Scenario: View on Click on square of sorted array
		Then Go back to previous page
		When Click on Practice Questions
 		And close the browser
 