package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Array_PageObject;
import pageObjects.LinkedList_page;
import utilities.ReadConfig;
import utilities.Util;

public class Step_Array {

	public Array_PageObject Ap = new Array_PageObject(Util.getChromeDriver());
	private static Logger LOGGER = LogManager.getLogger(Step_Array.class);
	public LinkedList_page LLp = new LinkedList_page(Util.getChromeDriver());

	
	@When("Click on Getstarted Button in Array")
	public void click_on_getstarted_button_in_array() {
		Ap.Click_on_getstarted_Btn();
	}

	@Then("The user be directed to {string} Page")
	public void the_user_be_directed_to_data_structure_page(String string) {

	}

	@When("Click on Arrays in Python Link")
	public void click_on_arrays_in_python_link() {
		LOGGER.info("Click on Arrays in Python Link");
		Ap.Click_on_arraypyn_Lnk();
	}

	@Then("The user redirected to {string} page")
	public void the_user_redirected_to_page(String string) {
		LOGGER.info("Click on Arrays in Python Link");

	}

	@Then("Click on Try Here Link")
	public void click_on_try_here_button_in_arrays_in_python_page() {
		LOGGER.info("Click on Arrays in Python Link");
		Ap.Click_on_tryhere_Btn();
	}

	@Then("Enter a python code in try editor box")
	public void enter_a_python_code_in_try_editor_box() {
		LOGGER.info("Click on Arrays in Python Link");
		LLp.setpythoncode(ReadConfig.getpythoncode());

	}

	@When("Click on Run button")
	public void click_on_run_button() {
		Ap.Click_on_run_Btn();
	}

//array using list link

	@When("Click on Arrays Using List Link")
	public void click_on_arrays_using_list_link() {
		Ap.Click_on_ArrayUsingList_Lnk();
	}

//	Basic Operations in Lists

	@When("Click on Basic Operations in Lists")
	public void click_on_basic_operations_in_lists() {
		Ap.Click_on_BasicOperationLst_Lnk();

	}

//Applications of Array

	@When("Click on Applications of Array")
	public void click_on_applications_of_array() {
		Ap.Click_on_ApplicationOfArray_Lnk();
	}

	@When("Click on Practice Questions")
	public void click_on_practice_questions() {
		Ap.PracticeQuestions_Lnk();
	}

	@When("Click on Search the array")
	public void click_on_search_the_array() {
		Ap.Click_on_SearchTheArray_Lnk();
	}

	@When("Click on Max consecutive ones")
	public void click_on_max_consecutive_ones() {
		Ap.Click_on_MaxConsecutiveOnes_Lnk();
	}

	@When("Click on find numbers with even numbers of digits")
	public void click_on_find_numbers_with_even_numbers_of_digits() {
		Ap.Click_on_FindNumberOfDigits_Lnk();
	}

	@When("Click on square of sorted array")
	public void click_on_square_of_sorted_array() {
		Ap.Click_On_SquareSortedAry_Lnk();
	}

	@Then("Go back to previous page")
	public void go_back_to_previous_page() {
		Ap.Click_On_Backbutton();
	}

}
