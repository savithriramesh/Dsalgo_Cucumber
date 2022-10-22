package stepDefinition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import io.cucumber.java.en.*;
import pageObjects.Tree_Page;
import utilities.Util;

public class Step_Tree {
private static Logger logger =  LogManager.getLogger();
	
	public Tree_Page Tp = new Tree_Page(Util.getChromeDriver());
	
	
	@When("Click on getstarted button in Tree")
	public void click_on_getstarted_button_in_tree() {
		
		Tp.Click_on_getstartedBtn();
	}

	@Then("The user should be redirected to Tree Page")
	public void the_user_should_be_redirected_to_tree_page() {
		Assert.assertEquals("Tree", Tp.getpageTitle());
		logger.info("User is On Tree Page");
	}

	@When("select Tree from List")
	public void select_tree_from_list() {
		Tp = new Tree_Page(Util.getChromeDriver());
	    Tp.SelectfromDropdown();
	}
	
	@When("Click on Try Here button on Tree")
	public void click_on_try_here_button_on_Tree() {
	    Tp.Click_on_tryhere();
	    logger.info("Try Here is clicked");
	}
	
	@Then("Enter Python code in Tree text editor")
	public void enter_python_code_in_Tree_text_editor() {
	   Tp.setpythoncode();
	   logger.info("python code is written");
	}
	
	@Then("user should be redirected to a page having an tryEditor with a Run button to test in Tree")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_in_Tree() {
		Assert.assertEquals("Assessment", Tp.getpageTitle());
	}
	
	@When("Click on Run in Tree")
	public void click_on_run_in_Tree() {
		Tp.Click_on_Run();
		logger.info("run button is clicked");
	}

	@Then("Answer should be displayed below Run button for Tree")
	public void Answer_should_be_displayed_below_run_button_for_Tree() {
	    Assert.assertEquals(Tp.getpython_output(), true);
	    logger.info("output is displayed in try editor");
	}
	
	@When("Click on Overview of Trees link")
	public void click_on_overview_of_trees_link() {
	    Tp.Click_on_Overview();
	}

	@Then("The user should be redirected to Overview of Trees Page")
	public void the_user_should_be_redirected_to_overview_of_trees_page() {
		Assert.assertEquals("Overview of Trees", Tp.getpageTitle());
		logger.info("User is On Tree - Overview of Trees Page");
	}

	@When("Click on Terminologies link")
	public void click_on_terminologies_link() {
	    Tp.Click_on_Terminologies();
	}

	@Then("The user should be redirected to Terminologies Page")
	public void the_user_should_be_redirected_to_terminologies_page() {
		Assert.assertEquals("Terminologies", Tp.getpageTitle());
		logger.info("User is On Tree - Terminologies Page");
	}

	@When("Click on Types of Trees link")
	public void click_on_types_of_trees_link() {
	    Tp.Click_on_TypesofTrees();
	}

	@Then("The user should be redirected to Types of Trees Page")
	public void the_user_should_be_redirected_to_types_of_trees_page() {
		Assert.assertEquals("Types of Trees", Tp.getpageTitle());
		logger.info("User is On Tree - Types of Trees Page");
	}

	@When("Click on Tree Traversals link")
	public void click_on_tree_traversals_link() {
	   Tp.Click_on_TreeTraversalss();
	}

	@Then("The user should be redirected to Tree Traversals Page")
	public void the_user_should_be_redirected_to_tree_traversals_page() {
		Assert.assertEquals("Tree Traversals", Tp.getpageTitle());
		logger.info("User is On Tree - Tree Traversals Page");
	}

	@When("Click on Traversals-Illustration link")
	public void click_on_traversals_illustration_link() {
	   Tp.Click_on_TraversalsIllustration();
	}

	@Then("The user should be redirected to Traversals-Illustration Page")
	public void the_user_should_be_redirected_to_traversals_illustration_page() {
		Assert.assertEquals("Traversals-Illustration", Tp.getpageTitle());
		logger.info("User is On Tree - Traversals-Illustration Page");
	}

	@When("Click on Binary Trees link")
	public void click_on_binary_trees_link() {
	    Tp.Click_on_BinaryTrees();
	}

	@Then("The user should be redirected to Binary Trees Page")
	public void the_user_should_be_redirected_to_binary_trees_page() {
		Assert.assertEquals("Binary Trees", Tp.getpageTitle());
		logger.info("User is On Tree - Binary Trees Page");
	}

	@When("Click on Types of Binary Trees link")
	public void click_on_types_of_binary_trees_link() {
	    Tp.Click_on_TypesofBinaryTrees();
	}

	@Then("The user should be redirected to Types of Binary Trees Page")
	public void the_user_should_be_redirected_to_types_of_binary_trees_page() {
		Assert.assertEquals("Types of Binary Trees", Tp.getpageTitle());
		logger.info("User is On Tree - Types of Binary Trees Page");
	}

	@When("Click on Implementation in Python link")
	public void click_on_implementation_in_python_link() {
	    Tp.Click_on_ImplementationinPython();
	}

	@Then("The user should be redirected to Implementation in Python Page")
	public void the_user_should_be_redirected_to_implementation_in_python_page() {
		Assert.assertEquals("Implementation in Python", Tp.getpageTitle());
		logger.info("User is On Tree - Implementation in Python Page");
	}

	@When("Click on Binary Tree Traversals link")
	public void click_on_binary_tree_traversals_link() {
	    Tp.Click_on_BinaryTreeTraversals();
	}

	@Then("The user should be redirected to Binary Tree Traversals Page")
	public void the_user_should_be_redirected_to_binary_tree_traversals_page() {
		Assert.assertEquals("Binary Tree Traversals", Tp.getpageTitle());
		logger.info("User is On Tree - Binary Tree Traversals Page");
	}

	@When("Click on  Implementation of Binary Trees link")
	public void click_on_implementation_of_binary_trees_link() {
	    Tp.Click_on_ImplementationofBinarytree();
	}

	@Then("The user should be redirected to Implementation of Binary Trees Page")
	public void the_user_should_be_redirected_to_implementation_of_binary_trees_page() {
		Assert.assertEquals("Implementation of Binary Trees", Tp.getpageTitle());
		logger.info("User is On Tree - Implementation of Binary Trees Page");
	}

	@When("Click on Applications of Binary trees link")
	public void click_on_applications_of_binary_trees_link() {
	    Tp.Click_on_ApplicationsofBinarytree();
	}

	@Then("The user should be redirected to Applications of Binary trees Page")
	public void the_user_should_be_redirected_to_applications_of_binary_trees_page() {
		Assert.assertEquals("Applications of Binary trees", Tp.getpageTitle());
		logger.info("User is On Tree - Applications of Binary trees Page");
	}

	@When("Click on Binary Search Trees link")
	public void click_on_binary_search_trees_link() {
	    Tp.Click_on_BinarySearchTrees();
	}

	@Then("The user should be redirected to Binary Search Trees Page")
	public void the_user_should_be_redirected_to_binary_search_trees_page() {
		Assert.assertEquals("Binary Search Trees", Tp.getpageTitle());
		logger.info("User is On Tree - Binary Search Trees Page");
	}

	@When("Click on Implementation Of BST link")
	public void click_on_implementation_of_bst_link() {
	    Tp.Click_on_ImplementationOfBST();
	}

	@Then("The user should be redirected to Implementation Of BST Page")
	public void the_user_should_be_redirected_to_implementation_of_bst_page() {
		Assert.assertEquals("Implementation Of BST", Tp.getpageTitle());
		logger.info("User is On Tree - Implementation Of BST Page");
	}

}
