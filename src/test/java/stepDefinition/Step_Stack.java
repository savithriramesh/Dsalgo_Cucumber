package stepDefinition;

import io.cucumber.java.en.*;
import pageObjects.Stack_Page;
import utilities.Util;

public class Step_Stack {

	public Stack_Page Sp = new Stack_Page(Util.getChromeDriver());
	
	@Then("Click on Getstarted Button in Stack")
	public void click_on_getstarted_button_in_stack() {
		Sp.Click_on_getstarted_Btn();
	}

	@When("Click on Operations in Stack")
	public void click_on_operations_in_stack() {
		Sp.Click_on_operation_in_stack();
	}

	@When("Click on Implementation")
	public void click_on_implementation() {
		Sp.Click_on_implementaion();
	}

	@When("Click on Applications")
	public void click_on_applications() {
		Sp.Click_on_Applications();
	}

}
