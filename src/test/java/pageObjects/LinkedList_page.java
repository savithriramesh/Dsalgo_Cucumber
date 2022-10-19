package pageObjects;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedList_page {
	public WebDriver Ldriver;

	@FindBy (xpath = "//a[contains(@href,'linked-list')][contains(text(),'Get Started')]")
	WebElement getstarted_btn;
	@FindBy (xpath = "//a[contains(@class,'nav-link dropdown-toggle')]")WebElement Drop_Down;
	@FindBy (linkText = "Linked List")WebElement DropDown_list;
	@FindBy (xpath = "//a[contains(text(),'Introduction')]")WebElement Intro_lnk;
	@FindBy (xpath = "//a[contains(text(),'Creating Linked LIst')]")WebElement creatingLinkedlist_lnk;
	@FindBy (xpath = "//a[contains(text(),'Types of Linked List')]")WebElement Types_lnk;
	@FindBy (xpath = "//a[contains(text(),'Implement Linked List in Python')]")WebElement implementLL_lnk;
	@FindBy (xpath = "//a[contains(text(),'Traversal')]")WebElement Traversal_lnk;
	@FindBy (xpath = "//a[contains(text(),'Insertion')]")WebElement Insertion_lnk;
	@FindBy (xpath = "//a[contains(text(),'Deletion')]")WebElement Deletion_lnk;
	@FindBy (xpath = "//a[contains(text(),'Try here>>>')]")WebElement Tryhere_Btn;
	@FindBy (xpath = "//a[contains(text(),'Practice Questions')]")WebElement PracticeQuestion_lnk;
	@FindBy (xpath = "//button[contains(text(),'Run')]")WebElement Run_Btn;
	@FindBy (xpath = "//div[contains(@class,'CodeMirror cm-s-default')]//textarea")WebElement python_code;
	@FindBy (id = "output") WebElement Python_output;
	
	public LinkedList_page (WebDriver driver){
		Ldriver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void Click_on_getstartedBtn() {
		getstarted_btn.click();
	}
	
	public void Click_on_introduction() {
		Intro_lnk.click();
	}
	
	public void Click_on_tryhere() {
		Tryhere_Btn.click();
	}
	
	public void setpythoncode() {
		Ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		python_code.sendKeys("print('name')");
	}
	
	public void Click_on_run() {
		Run_Btn.click();
	}
	
	public void Click_on_creatinglinkedlist() {
		creatingLinkedlist_lnk.click();
	}
	
	public void Click_on_TypesofLL() {
		Types_lnk.click();
	}
	
	public void Click_on_implementLL() {
		implementLL_lnk.click();
	}
	
	public void Click_on_TraversalsLL() {
		Traversal_lnk.click();
	}
	
	public void Click_on_InsertionLL() {
		Insertion_lnk.click();
	}
	
	public void Click_on_DeletionLL() {
		Deletion_lnk.click();
	}
	
	public void SelectfromDropdown() {
		Drop_Down.click();
		DropDown_list.click();;
		}
	
	public String getpageTitle()
	{
		return Ldriver.getTitle();
	}
	
	public Boolean getpython_output()
	{
		return Python_output.isDisplayed();
		
	}

}
