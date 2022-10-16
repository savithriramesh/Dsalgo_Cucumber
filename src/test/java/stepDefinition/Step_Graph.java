package stepDefinition;

import io.cucumber.java.en.*;
import pageObjects.Graph_Page;
import utilities.Util;

public class Step_Graph {

	public Graph_Page Gp = new Graph_Page(Util.getChromeDriver());
	
	@Then("Click on Getstarted Button in graph")
	public void click_on_getstarted_button_in_graph() {
		Gp.Click_on_getstarted_Btn();
	}

	@When("Click on graph link")
	public void click_on_graph_link() {
		Gp.Click_on_graph_lnk();
	}

	@When("Click on graph representations link")
	public void click_on_graph_representations_link() {
		Gp.Click_on_graph_Rep_lnk();
	}
}
