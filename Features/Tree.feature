@tag
Feature: Tree

Scenario: User Open Tree page 
  	Given Launch chrome Browser
    When User Opens URL "https://dsportalapp.herokuapp.com/home"
    When Click on Sigin
    And User Enters Login data as in 3
    When Click on LoginButton
    Then Click on getstarted button in Tree
 		Then The user should be redirected to Tree Page 
 		
 			
  	@test
  Scenario: User validate Overview page 
   
    When Click on Overview of Trees link
  	Then The user should be redirected to Overview of Trees Page 
  	And Click on Try Here button on Tree
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  	@tag1
  Scenario: User validate Terminologies page 
  
  	Then Go back to previous page
    When Click on Terminologies link
  	Then The user should be redirected to Terminologies Page 
  	And Click on Try Here button on Tree
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  	@tag1
  Scenario: User validate Types of Trees page 
    Then Go back to previous page
    When Click on Types of Trees link
  	Then The user should be redirected to Types of Trees Page 
  	And Click on Try Here button on Tree
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  	@tag1
  Scenario: User validate Tree Traversals page 
   	Then Go back to previous page
    When Click on Tree Traversals link
  	Then The user should be redirected to Tree Traversals Page 
  	And Click on Try Here button on Tree
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  	@tag1
  Scenario: User validate Traversals-Illustration page 
    Then Go back to previous page
    When Click on Traversals-Illustration link
  	Then The user should be redirected to Traversals-Illustration Page 
  	And Click on Try Here button on Tree
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  	
  	@tag1
  Scenario: User validate Binary Trees page 
    Then Go back to previous page
    When Click on Binary Trees link
  	Then The user should be redirected to Binary Trees Page 
  	And Click on Try Here button on Tree
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  	
  	@tag1
  Scenario: User validate Types of Binary Trees page 
    Then Go back to previous page
    When Click on Types of Binary Trees link
  	Then The user should be redirected to Types of Binary Trees Page 
  	And Click on Try Here button on Tree
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  		@tag1
  Scenario: User validate Implementation in Python page 
   	Then Go back to previous page
    When Click on Implementation in Python link
  	Then The user should be redirected to Implementation in Python Page 
  	And Click on Try Here button on Tree
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  		@tag1
  Scenario: User validate Binary Tree Traversals page 
    Then Go back to previous page
    When Click on Binary Tree Traversals link
  	Then The user should be redirected to Binary Tree Traversals Page 
  	And Click on Try Here button on Tree
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  	@tag1
  Scenario: User validate Implementation of Binary Trees page 
   	Then Go back to previous page
    When Click on  Implementation of Binary Trees link
  	Then The user should be redirected to Implementation of Binary Trees Page 
  	And Click on Try Here button on Tree
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  	@tag1
  Scenario: User validate Applications of Binary trees page 
    Then Go back to previous page
    When Click on Applications of Binary trees link
  	Then The user should be redirected to Applications of Binary trees Page 
  	And Click on Try Here button on Tree
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  	@tag1
  Scenario: User validate Binary Search Trees page 
    Then Go back to previous page
    When Click on Binary Search Trees link
  	Then The user should be redirected to Binary Search Trees Page 
  	And Click on Try Here button on Tree
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button
  	
  	@tag1
  Scenario: User validate Implementation Of BST page 
    Then Go back to previous page
    When Click on Implementation Of BST link
  	Then The user should be redirected to Implementation Of BST Page
  	And Click on Try Here button on Tree
  	Then user should be redirected to a page having an tryEditor with a Run button to test
  	And  Enter Python code in text editor
  	When Click on Run
  	Then Answer should be displayed below Run button 
  	And close the browser
  	