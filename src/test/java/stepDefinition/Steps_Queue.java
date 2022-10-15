package stepDefinition;


import io.cucumber.java.en.When;
import pageObjects.Queue_PageObject;
import utilities.Util;

public class Steps_Queue {
	
	public Queue_PageObject Qp = new Queue_PageObject(Util.getChromeDriver());
	
	@When("Click on Getstarted Button in Queue")
	public void click_on_getstarted_button_in_queue() {
		Qp.Click_on_Getstarted_Btn();
	}

	@When("Click on Implementation of Queue in Python Link")
	public void click_on_implementation_of_queue_in_python_link() {
		Qp.Click_on_ImplmtnQuePyn_Lnk();
	}
	
	@When("Click on Implementation using collections.deque link")
	public void click_on_implementation_using_collections_deque_link() {
		Qp.Click_on_ImplmtUsgColtn_Lnk();
	}

	@When("Click on Implementation using array link")
	public void click_on_implementation_using_array_link() {
		Qp.Click_on_ImplmtUsgAry_Lnk();
		
	}

	@When("Click on Queue Operations link")
	public void click_on_queue_operations_link() {
		Qp.Click_on_QueOprtn_Btn();
	}


}
