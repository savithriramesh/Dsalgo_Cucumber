package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Util;

public class Array_PageObject {

	public WebDriver Rdriver;

	@FindBy(xpath = ("//a[@href='array']"))
	WebElement getStartedBtn1;
	@FindBy(xpath = ("//a[text()='Arrays in Python']"))
	WebElement aryPynLnk;
	@FindBy(xpath = ("//a[text()='Try here>>>']"))
	WebElement tryHrBtn;
	@FindBy(xpath = ("//form[@id='answer_form']/div/div/div/textarea"))
	WebElement tryEdtBx;
	@FindBy(xpath = ("//button[text()='Run']"))
	WebElement runBtn;
	@FindBy(xpath = ("//a[text()='Arrays Using List']"))
	WebElement aryUsgLst;
	@FindBy(xpath = ("//a[text()='Basic Operations in Lists']"))
	WebElement bscOprnLst;
	@FindBy(xpath = ("//a[text()='Applications of Array']"))
	WebElement appAryBtn;
	@FindBy(linkText = ("Practice Questions"))
	WebElement prctQuen;
	@FindBy(linkText = ("Search the array"))
	WebElement srhAry;
	@FindBy(linkText = ("Max Consecutive Ones"))
	WebElement mxCnsteOns;
	@FindBy(linkText = ("Find Numbers with Even Number of Digits"))
	WebElement fndDits;
	@FindBy(xpath = ("//a[text()='Squares of  a Sorted Array']"))
	WebElement sqrSrtAry;
	

	public Array_PageObject(WebDriver driver) {
		Rdriver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Click_on_getstarted_Btn() {
		getStartedBtn1.click();

	}

	public void Click_on_arraypyn_Lnk() {
		aryPynLnk.click();

	}

	public void Click_on_tryhere_Btn() {
		tryHrBtn.click();
	}

	public void Type_On_tryEdtBx() {
		//tryEdtBx.click();
		Actions ac = new Actions(Util.getChromeDriver());
		ac.click(tryEdtBx).sendKeys("print('Python')").perform();
	}
	
	public void Click_on_run_Btn() {
		runBtn.click();
	}

	public void Click_on_ArrayUsingList_Lnk() {
		aryUsgLst.click();
	}

	public void Click_on_BasicOperationLst_Lnk() {
		bscOprnLst.click();
	}

	public void Click_on_ApplicationOfArray_Lnk() {
		appAryBtn.click();
	}

	public void PracticeQuestions_Lnk() {
		prctQuen.click();
	}

	public void Click_on_SearchTheArray_Lnk() {
		srhAry.click();
	}

	public void Click_on_MaxConsecutiveOnes_Lnk() {
		mxCnsteOns.click();
	}

	public void Click_on_FindNumberOfDigits_Lnk() {
		fndDits.click();
	}

	public void Click_On_SquareSortedAry_Lnk() {
		sqrSrtAry.click();
	}
	public void Click_On_Backbutton() {
		Rdriver.navigate().back();	
	}
	
	public String getpageTitle()
	{
		return Rdriver.getTitle();
	}
}