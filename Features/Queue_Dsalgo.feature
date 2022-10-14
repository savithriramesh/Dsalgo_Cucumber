@tag
Feature: Queue

 @tag1
 Scenario: View on Queue in Data structure
    When Click on Getstarted Button in Queue
    Then The user be directed to "Queue" Data Structure Page
		When Click on Implementation of Queue in Python Link
  	And  Click on Try Here Link
  	Then The user redirected to "TryEditor" page
  	And Enter a python code in try editor box
  	When Click on Run button
  	
 @tag2 	
 Scenario: 2
 		When Click on Implementation using collections.deque link
 		When Click on Try Here Link
 		Then The user redirected to "TryEditor" page
 		And Enter a python code in try editor box
  	When Click on Run button
  	
  	@tag3 	
 Scenario: 2
 		When Click on Implementation using array link
 		When Click on Try Here Link
 		Then The user redirected to "TryEditor" page
 		And Enter a python code in try editor box
  	When Click on Run button
  	
  	
  	Scenario: 2
 		When Click on Queue Operations link
 		When Click on Try Here Link
 		Then The user redirected to "TryEditor" page
 		And Enter a python code in try editor box
  	When Click on Run button
  	When Click on Practice Questions
  	