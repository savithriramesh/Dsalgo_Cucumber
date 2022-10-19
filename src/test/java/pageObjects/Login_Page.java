package pageObjects;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page {
	public WebDriver Rdriver;

	@FindBy (xpath = "//a[contains(text(),'Sign in')]") WebElement Signin_lnk;
	@FindBy (name = "username")WebElement Username;
	@FindBy (name = "password")WebElement password;
	@FindBy (xpath = "//input[contains(@value,'Login')]") WebElement Login_Btn;
	@FindBy (xpath = "//div[contains(text(),'Invalid Username and Password')]") WebElement err_msg;
	@FindBy (linkText = "Sign out")WebElement signout_Btn;
	
	public Login_Page (WebDriver driver){
		Rdriver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void Click_on_Sigin() {
		Signin_lnk.click();
	}
	
	public void SetLoginData(String username,String pwd) {
		Rdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Username.sendKeys(username);
		password.sendKeys(pwd);
	}
	
	public void Click_on_Login() {
		Rdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Login_Btn.click();
	}
	
	public void check_errormsg() {
		Rdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	public void Click_on_signout() {
		//Rdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		signout_Btn.click();
	}

	public String getpageTitle()
	{
		return Rdriver.getTitle();
	}
	
	
	

	
}


