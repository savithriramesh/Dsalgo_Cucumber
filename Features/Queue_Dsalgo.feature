@tag
Feature: Queue

		@queue
		Scenario:Login
		Given Launch chrome Browser
    When User Opens URL "https://dsportalapp.herokuapp.com"
    When Click on Getstarted Button
    When Click on Sigin
    And User Enters Login data as in 3
    When Click on LoginButton
    When Click on Getstarted Button in Queue
    When Click on Implementation of Queue in Python Link
    

 		@queue_data
 		Scenario: View on Queue in Data structure
  	And  Click on Try Here Link
  	Then The user redirected to "TryEditor" page
  	And Enter a python code in try editor box
  	When Click on Run button
  	Then Go back to previous page
  	
  	
 		@deque 	
 		Scenario: View on Implementation using collections.deque link
 		When Click on Implementation using collections.deque link
 		When Click on Try Here Link
 		Then The user redirected to "TryEditor" page
 		And Enter a python code in try editor box
  	When Click on Run button
  	Then Go back to previous page
  	
  	@imple_array 	
 		Scenario: Implementing using array link
 		When Click on Implementation using array link
 		When Click on Try Here Link
 		Then The user redirected to "TryEditor" page
 		And Enter a python code in try editor box
  	When Click on Run button
  	Then Go back to previous page
  	
  	
  	@que_oper
  	Scenario: Queue operations link
 		When Click on Queue Operations link
 		When Click on Try Here Link
 		Then The user redirected to "TryEditor" page
 		And Enter a python code in try editor box
  	When Click on Run button
  	Then Go back to previous page
  	
  	@prac_ques
  	Scenario:Practice Questions
  	When Click on Practice Questions
  	And close the browser
  	
  	
  	
  	
  	