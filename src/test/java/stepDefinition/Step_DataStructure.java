package stepDefinition;

import io.cucumber.java.en.*;
import pageObjects.DataStructure_Page;
import utilities.Util;

public class Step_DataStructure {
	
	public DataStructure_Page Dp = new DataStructure_Page(Util.getChromeDriver());
	
	@Then("Click on Getstarted Button in data structure")
	public void click_on_getstarted_button_in_data_structure() {
				Dp.Click_on_getstarted_Btn();
	}

	@Then("The user be directed to data structure Page")
	public void the_user_be_directed_to_data_structure_page() {
		
	}

	@When("Click on Time Complexity Link")
	public void click_on_time_complexity_link() {
		Dp.Click_on_time_complexity();
	}


}
