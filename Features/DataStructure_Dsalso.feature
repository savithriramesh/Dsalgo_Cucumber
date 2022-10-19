Feature: Data Structure

		@data
  	Scenario:Login
		Given Launch chrome Browser
    When User Opens URL "https://dsportalapp.herokuapp.com"
    When Click on Getstarted Button
    When Click on Sigin
    And User Enters Login data as in 3
    When Click on LoginButton
    Then Click on Getstarted Button in data structure
    Then The user be directed to data structure Page
    
    @data_stru 
		Scenario: View on Data Structure
		When Click on Time Complexity Link
  	And  Click on Try Here Link
  	Then The user redirected to "TryEditor" page
  	And Enter a python code in try editor box
  	When Click on Run button
  	Then Go back to previous page
  	
  	Scenario: View on Data Structure introdution
		When Click on Time Complexity Link
  	When Click on Practice Questions
  	And close the browser
  	
  	
  	

  