package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tree_Page {
	public WebDriver Rdriver;

	@FindBy(xpath = "//a[contains(@href,'tree')][contains(text(),'Get Started')]")
	WebElement getstarted_btn;
	@FindBy(xpath = "//a[contains(@class,'nav-link dropdown-toggle')]")
	WebElement Drop_Down;
	@FindBy(linkText = "Tree")
	WebElement DropDown_list;
	@FindBy(xpath = "//a[contains(text(),'Introduction')]")
	WebElement Intro_lnk;
	@FindBy(linkText = "Overview of Trees")
	WebElement Overview_lnk;
	@FindBy(xpath = "//a[contains(text(),'Terminologies')]")
	WebElement Terminologies_lnk;
	@FindBy(xpath = "//a[contains(text(),'Types of Trees')]")
	WebElement TypesofTree_lnk;
	@FindBy(xpath = "//a[contains(text(),'Tree Traversals')]")
	WebElement TreeTraversals_lnk;
	@FindBy(xpath = "//a[contains(text(),'Traversals-Illustration')]")
	WebElement TraversalsIllustration_lnk;
	@FindBy(xpath = "//a[contains(text(),'Binary Trees')]")
	WebElement BinaryTrees_lnk;
	@FindBy(xpath = "//a[contains(text(),'Types of Binary Trees')]")
	WebElement TypeBinaryTrees_lnk;
	@FindBy(xpath = "//a[contains(text(),'Implementation in Python')]")
	WebElement ImplementationinPython_lnk;
	@FindBy(xpath = "//a[contains(text(),'Binary Tree Traversals')]")
	WebElement BinaryTreeTraversals_lnk;
	@FindBy(xpath = "//a[contains(text(),'Implementation of Binary Trees')]")
	WebElement ImplementationofBinaryTrees_lnk;
	@FindBy(xpath = "//a[contains(text(),'Applications of Binary trees')]")
	WebElement ApplicationsBinaryTrees_lnk;
	@FindBy(xpath = "//a[contains(text(),'Binary Search Trees')]")
	WebElement BinarySearchTrees_lnk;
	@FindBy(xpath = "//a[contains(text(),'Implementation Of BST')]")
	WebElement ImpletentationBST_lnk;
	@FindBy(xpath = "//a[contains(text(),'Try here>>>')]")
	WebElement Tryhere_Btn;
	@FindBy(xpath = "//a[contains(text(),'Practice Questions')]")
	WebElement PracticeQuestion_lnk;
	@FindBy(xpath = "//button[contains(text(),'Run')]")
	WebElement Run_Btn;
	@FindBy(xpath = "//div[contains(@class,'CodeMirror cm-s-default')]//textarea")
	WebElement python_code;
	@FindBy(id = "output")
	WebElement Python_output;

	public Tree_Page(WebDriver driver) {
		Rdriver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Click_on_getstartedBtn() {
		getstarted_btn.click();
	}

	public void Click_on_Overview() {
		Overview_lnk.click();
	}

	public void Click_on_tryhere() {
		Tryhere_Btn.click();
	}

	public void Click_on_Run() {
		Run_Btn.click();
	}

	public void setpythoncode() {
		python_code.sendKeys("print('name')");
	}

	public void Click_on_Terminologies() {
		Terminologies_lnk.click();
	}

	public void Click_on_TypesofTrees() {
		TypesofTree_lnk.click();
	}

	public void Click_on_TreeTraversalss() {
		TreeTraversals_lnk.click();
	}

	public void Click_on_TraversalsIllustration() {
		TraversalsIllustration_lnk.click();
	}

	public void Click_on_BinaryTrees() {
		BinaryTrees_lnk.click();
	}

	public void Click_on_TypesofBinaryTrees() {
		TypeBinaryTrees_lnk.click();
	}

	public void Click_on_ImplementationinPython() {
		ImplementationinPython_lnk.click();
	}

	public void Click_on_BinaryTreeTraversals() {
		BinaryTreeTraversals_lnk.click();
	}

	public void Click_on_ImplementationofBinarytree() {
		ImplementationofBinaryTrees_lnk.click();
	}

	public void Click_on_ApplicationsofBinarytree() {
		ApplicationsBinaryTrees_lnk.click();
	}

	public void Click_on_BinarySearchTrees() {
		BinarySearchTrees_lnk.click();
	}

	public void Click_on_ImplementationOfBST() {
		ImpletentationBST_lnk.click();
	}

	public void Click_on_practicequestion() {
		PracticeQuestion_lnk.click();
	}

	public void SelectfromDropdown() {
		Drop_Down.click();
		DropDown_list.click();
		;
	}

	public String getpageTitle() {
		return Rdriver.getTitle();
	}

	public Boolean getpython_output() {
		return Python_output.isDisplayed();

	}

}
