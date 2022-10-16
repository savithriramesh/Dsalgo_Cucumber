package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Util;

public class DataStructure_Page {
	
	public WebDriver Rdriver;
	
	@FindBy(xpath = ("//a[@href='data-structures-introduction']"))
	WebElement getStartedBtn;
	@FindBy(linkText = ("Time Complexity"))
	WebElement timeCmplty;
	@FindBy(xpath = ("//a[text()='Try here>>>']"))
	WebElement tryHrBtn;
	@FindBy(xpath = ("//form[@id='answer_form']/div/div/div/textarea"))
	WebElement tryEdtBx;
	@FindBy(xpath = ("//button[text()='Run']"))
	WebElement runBtn;
	@FindBy(linkText = ("Practice Questions"))
	WebElement prctQuen;
	
	
	public DataStructure_Page(WebDriver driver) {
		Rdriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void Click_on_getstarted_Btn() {
		getStartedBtn.click();

	}
	
	public void Click_on_time_complexity() {
		timeCmplty.click();
		
	}
	public void Click_on_tryhere_Btn() {
		tryHrBtn.click();
	}

	public void Type_On_tryEdtBx() {
		Actions ac = new Actions(Util.getChromeDriver());
		ac.click(tryEdtBx).sendKeys("print('Python')").perform();
	}
	
	public void Click_on_run_Btn() {
		runBtn.click();
	}
}
