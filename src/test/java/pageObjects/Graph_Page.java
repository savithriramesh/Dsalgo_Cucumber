package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Graph_Page {

	public WebDriver Rdriver;
	
	@FindBy(xpath = ("//a[@href='graph']"))
	WebElement getStartedBtn;
	@FindBy(linkText = ("Graph"))
	WebElement graph;
	@FindBy(linkText = ("Graph Representations"))
	WebElement grphRep;
	@FindBy(linkText = ("Practice Questions"))
	WebElement prctQuen;
	
	
	
	
	
	public Graph_Page(WebDriver driver) {
		Rdriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Click_on_getstarted_Btn() {
		getStartedBtn.click();

	}
	
	
	public void Click_on_graph_lnk() {
		graph.click();

	}
	
	
	public void Click_on_graph_Rep_lnk() {
		grphRep.click();

	}
	
	
	public void Click_on_Practice_Questions() {
		prctQuen.click();

	}
	
}
