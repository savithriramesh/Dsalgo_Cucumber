package pageObjects;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page {
	public WebDriver Ldriver;

	@FindBy (xpath = "//a[contains(text(),'Sign in')]") WebElement Signin_lnk;
	@FindBy (name = "username")WebElement Username;
	@FindBy (name = "password")WebElement password;
	@FindBy (xpath = "//input[contains(@value,'Login')]") WebElement Login_Btn;
	@FindBy (xpath = "//div[contains(text(),'Invalid Username and Password')]") WebElement err_msg;
	@FindBy (linkText = "Sign out")WebElement signout_Btn;
	@FindBy (xpath = "//div[@class= 'navbar-nav']//ul//a[2]") WebElement Login_name;
	@FindBy (xpath = "//form[@method= 'post']//input[@name = 'csrfmiddlewaretoken']") WebElement ErrorMsg_popup;
	@FindBy (xpath = "//div[contains(text(),'Logged out successfully')]") WebElement Logout_Msg;
	@FindBy (xpath = "//a[contains(text(),'Sign out')]") WebElement Signout_lnk;
	
	
	public Login_Page (WebDriver driver){
		Ldriver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void Click_on_Sigin() {
		Signin_lnk.click();
	}
	
	public void Click_on_Signout() {
		Signout_lnk.click();
	}
	
	public String check_signoutmsg() {
		Ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return Logout_Msg.getText();
	}
	
	public void SetLoginData(String username,String pwd) {
		Ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Username.sendKeys(username);
		password.sendKeys(pwd);
	}
	
	public void Click_on_Login() {
		Ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Login_Btn.click();
	}
	
	public String check_errormsg() {
		Ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return err_msg.getText();
	}
	
	public boolean check_errormsgPopup() {
		Ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return ErrorMsg_popup.isDisplayed();
	}
	
	public void Click_on_signout() {
		Ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		signout_Btn.click();
	}
	
	public String get_loginname() {
		Ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return Login_name.getText();
	}
	
	public String getpageTitle()
	{
		return Ldriver.getTitle();
	}
	
	

	
}


