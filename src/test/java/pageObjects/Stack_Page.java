package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stack_Page {

	public WebDriver Rdriver;


	@FindBy(xpath = ("//a[@href='stack']"))
	WebElement getStartedBtn;
	@FindBy(linkText = ("Operations in Stack"))
	WebElement oprtStk;
	@FindBy(linkText = ("Implementation"))
	WebElement implmn;
	@FindBy(linkText = ("Applications"))
	WebElement aplicn;
	@FindBy(linkText = ("Practice Questions"))
	WebElement prctQuen;
	
	public Stack_Page(WebDriver driver) {
		Rdriver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void Click_on_getstarted_Btn() {
		getStartedBtn.click();

	}
	
	public void Click_on_operation_in_stack() {
		oprtStk.click();

	}
	
	public void Click_on_implementaion() {
		implmn.click();

	}
	
	public void Click_on_Applications() {
		aplicn.click();

	}
	
	public void Click_on_Practice_Questions() {
		prctQuen.click();

	}
}
