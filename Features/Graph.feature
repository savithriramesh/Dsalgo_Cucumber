Feature: Graph

 Background:
		Given Launch chrome Browser
    When User Opens URL "https://dsportalapp.herokuapp.com"
    When Click on Getstarted Button
    When Click on Sigin
    And User Enters Login data as in 3
    When Click on LoginButton
    Then Click on Getstarted Button in graph
    Then The user be directed to "graph" Page

 	@graph 
	Scenario: View on graph page
		When Click on graph link
  	And  Click on Try Here Link
  	Then The user redirected to "TryEditor" page
  	And Enter a python code in try editor box
  	When Click on Run button
  	And close the browser
 
 
 	@graph_rep
	Scenario: View on graph page
		When Click on graph representations link
  	And close the browser
 
 	@graph 
	Scenario: View on graph page
		When Click on graph link
		When Click on Practice Questions
  	And close the browser
  	
  	