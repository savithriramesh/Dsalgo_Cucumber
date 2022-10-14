package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NumpyNinja_DataStructure {
	
	public static WebDriver driver=new ChromeDriver();
	String URL="https://dsportalapp.herokuapp.com/";
	
	@FindBy (linkText=("//button[text()='Get Started']")) WebElement getStartedBtn;
	@FindBy (xpath=("//div[@class='nav-item dropdown']")) WebElement dataDrpDwnBtn;
	@FindBy (xpath=("//a[text()='Arrays']")) WebElement arrayBtn;
	@FindBy (linkText=("Sign in")) WebElement signIn;
	@FindBy (xpath=("//a[@href='Register!']")) WebElement regBtn;
	@FindBy (xpath=("//input[@value='Register']")) WebElement regBtn1;
	@FindBy (name=("Username")) WebElement userName;
	@FindBy (xpath=("//input[@value='Register']")) WebElement regBtn2;
	@FindBy (name=("Password")) WebElement password;
	@FindBy (xpath=("//input[@value='Register']")) WebElement regBtn3;
	@FindBy (name=("Password confirmation")) WebElement passwordCnfrmBtn;
	@FindBy (xpath=("//input[@value='Register']")) WebElement regBtn4;
	@FindBy (linkText=("Sign in")) WebElement signIn1;
	@FindBy (name=("Username")) WebElement userName1;
	@FindBy (linkText=("//input[@value='Login']")) WebElement login;
	@FindBy (name=("Password")) WebElement passwrd;
	@FindBy (linkText=("//input[@value='Login']")) WebElement login1;
	
	
	//Array
	@FindBy (xpath=("//a[@href='array']")) WebElement getStartedBtn1;	
	@FindBy (xpath=("//a[text()='Arrays in Python']")) WebElement aryPynBtn;
	@FindBy (xpath=("//a[text()='Try here>>>']")) WebElement tryHrBtn;	
	@FindBy (xpath=("//button[text()='Run']")) WebElement runBtn;
	@FindBy (xpath=("//a[text()='Arrays Using List']")) WebElement aryUsgLst;
	@FindBy (xpath=("//a[text()='Try here>>>']")) WebElement tryHrBtn1;
	@FindBy (xpath=("//button[text()='Run']")) WebElement runBtn1;
	@FindBy (xpath=("//a[text()='Basic Operations in Lists']")) WebElement bscOprnLst;
	@FindBy (xpath=("//a[text()='Try here>>>']")) WebElement tryHrBtn2;
	@FindBy (xpath=("//button[text()='Run']")) WebElement runBtn2;
	@FindBy (xpath=("//a[text()='Applications of Array']")) WebElement appAryBtn;
	@FindBy (xpath=("//a[text()='Try here>>>']")) WebElement tryHrBtn3;
	@FindBy (xpath=("//button[text()='Run']")) WebElement runBtn3;
	@FindBy (xpath=("//a[text()='Practice Questions']")) WebElement prctQuen;
	@FindBy (linkText=("Search the array")) WebElement srhAry;
	@FindBy (linkText=("Max Consecutive Ones")) WebElement mxCnsteOns;
	@FindBy (linkText=("Find Numbers with Even Number of Digits")) WebElement fndDits;
	@FindBy (linkText=("Squares of  a Sorted Array")) WebElement sqrSrtAry;
	
	
	//queue	
	@FindBy (xpath=("//a[@href='queue']")) WebElement getStartedBtn2;
	@FindBy (linkText=("Implementation of Queue in Python")) WebElement imnPyn;
	@FindBy (xpath=("//a[text()='Try here>>>']")) WebElement tryHrBtn5;
	@FindBy (linkText=("Implementation using collections.deque")) WebElement imnCltDq;
	@FindBy (xpath=("//a[text()='Try here>>>']")) WebElement tryHrBtn6;
	@FindBy (linkText=("Implementation using array")) WebElement imnAry;
	@FindBy (xpath=("//a[text()='Try here>>>']")) WebElement tryHrBtn7;
	@FindBy (linkText=("Queue Operations")) WebElement queOprn;
		
		
	
	
	
	
	
	
	public void Juiceshop_pageobject (WebDriver chromedriver){
		//this.driver=chromedriver;
		
	}	
	
	
	public void register() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
		
		getStartedBtn.click();
		dataDrpDwnBtn.click();
		arrayBtn.click();
		signIn.click();
		regBtn.click();
		regBtn1.click();
		//userName.sendKeys("savithri@!");
		//password.sendKeys("savi@123");
		userName.sendKeys("sanjan");
		regBtn2.click();
		password.sendKeys("third@123");
		regBtn3.click();
		passwordCnfrmBtn.sendKeys("third@123");
		regBtn4.click();
		signIn1.click();
		userName1.click();
		login.click();
		passwrd.click();
	}
	public void array() {	
		getStartedBtn1.click();
		aryPynBtn.click();
		tryHrBtn.click();
		runBtn.click();
		aryUsgLst.click();
		tryHrBtn1.click();
		runBtn1.click();
		bscOprnLst.click();
		tryHrBtn2.click();
		runBtn2.click();
		appAryBtn.click();
		tryHrBtn3.click();
		runBtn3.click();
		prctQuen.click();
		srhAry.click();
		mxCnsteOns.click();
		fndDits.click();
		sqrSrtAry.click();
	}
	public void queue() {
		getStartedBtn2.click();
		imnPyn.click();
		tryHrBtn5.click();
		imnCltDq.click();
		tryHrBtn6.click();
		imnAry.click();
		tryHrBtn7.click();
		queOprn.click();
	}
	

}
