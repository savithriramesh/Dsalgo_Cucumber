@tag
Feature:login

  
  @tag1
  Scenario: Login without Username and Password
    Given Launch chrome Browser 
    When User Opens URL "https://dsportalapp.herokuapp.com"
    When Click on Getstarted Button
    When Click on Sigin
    When Click on LoginButton
		Then Go back to previous page
		
  @tag2
  Scenario Outline: 
    Given Launch chrome Browser
    When User Opens URL "https://dsportalapp.herokuapp.com"
    When Click on Getstarted Button
    When Click on Sigin
    And User Enters Login data as in <rowindex>
    When Click on LoginButton
    Then Go back to previous page
		And close the browser
    Examples: 
      | rowindex  |  
      | 1 |   
      | 2 |
      | 3 |
  	 