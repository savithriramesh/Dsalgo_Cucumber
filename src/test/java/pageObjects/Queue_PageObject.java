package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Queue_PageObject {
	
	public WebDriver Rdriver;
	
	@FindBy (xpath=("//a[@href='queue']")) WebElement getStartedBtn;
	@FindBy (linkText=("Implementation of Queue in Python")) WebElement imnPyn;
	@FindBy (xpath=("//a[text()='Try here>>>']")) WebElement tryHrBtn;
	@FindBy (linkText=("Implementation using collections.deque")) WebElement imnCltDq;
	@FindBy (linkText=("Implementation using array")) WebElement imnAry;
	@FindBy (linkText=("Queue Operations")) WebElement queOprn;
	
	
	public Queue_PageObject (WebDriver driver){
		Rdriver=driver;
		PageFactory.initElements(driver, this);	
	}	
		
		public void Click_on_Getstarted_Btn() {
			getStartedBtn.click();
}
		public void Click_on_ImplmtnQuePyn_Lnk() {
			imnPyn.click();
}
		public void Click_on_tryHere_Btn() {
			tryHrBtn.click();
}
		public void Click_on_ImplmtUsgColtn_Lnk() {
			imnCltDq.click();
}
		public void Click_on_ImplmtUsgAry_Lnk() {
			imnAry.click();
}
		public void Click_on_QueOprtn_Btn() {
			queOprn.click();
}
		
}