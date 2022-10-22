@tag
Feature: LinkedList


  		@test1
  Scenario: User Open Linked List page 
  	Given Launch chrome Browser
    When User Opens URL "https://dsportalapp.herokuapp.com/home"
    When Click on Sigin
    And User Enters Login data as in 3
    When Click on LoginButton
    Then Click on getstarted button in LinkedList
 		Then The user should be redirected to Linked List Page 
  	
  	@test1
  Scenario: User validate Introduction page 
   
    When Click on introduction link
  	Then The user should be redirected to Introduction Page 
  	And Click on Try Here button
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  	
  	@test
  Scenario: User validate Create a Linked List page  
    Then Go back to previous page
    When Click on Create a Linked List link
    Then The user should be redirected to Create a Linked List Page
  	And Click on Try Here button
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  	
  	 Scenario: User validate Types of Linked List page 
    Then Go back to previous page
    When Click on Types of Linked List link
  	Then The user should be redirected to Types of Linked List Page
  	And Click on Try Here button
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  	
  	Scenario: User validate Implement Linked List in Python page 
    Then Go back to previous page
    When Click on Implement Linked List in Python link
  	Then The user should be redirected to Implement Linked List in Python Page
  	And Click on Try Here button
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  	
  	Scenario: User validate Traversal page 
    Then Go back to previous page
    When Click on Traversal link
  	Then The user should be redirected to Traversal Page
  	And Click on Try Here button
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  	Scenario: User validate Insertion page 
   Then Go back to previous page
    When Click on Insertion link
    Then The user should be redirected to Insertion Page
  	And Click on Try Here button
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  
  	Scenario: User validate Deletion page 
    Then Go back to previous page
    When Click on Deletion link
  	Then The user should be redirected to Deletion Page
  	And Click on Try Here button
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	And close the browser
 