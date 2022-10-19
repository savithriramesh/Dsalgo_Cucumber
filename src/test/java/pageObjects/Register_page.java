package pageObjects;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Register_page {

	public WebDriver Rdriver;

	@FindBy (xpath = "//a[contains(text(),' Register ')]") WebElement register_lnk;
	@FindBy (name = "username")WebElement Username;
	@FindBy (name = "password1")WebElement password;
	@FindBy (name = "password2")WebElement cnf_password;
	@FindBy (xpath = "//input[contains(@value,'Register')]") WebElement register_Btn;
	@FindBy (xpath = "//div[@class= 'navbar-nav']//ul//a[2]") WebElement registername_name;
	@FindBy (xpath = "//div[@class='alert alert-primary']") WebElement success_msg;
	@FindBy (xpath = "//div[@class='alert alert-primary']") WebElement err_msg;
	
	
	public Register_page (WebDriver driver){
		Rdriver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void Click_on_register() {
		register_lnk.click();
	}
	
	public void set_username(String usernamee) {
		Username.sendKeys(usernamee);
	}
	
	public void set_Password(String Password) {
		password.sendKeys(Password);
	}
	
	public void set_confPassword(String cnfPassword) {
		cnf_password.sendKeys(cnfPassword);
	}
	
	public void SetregisterData(String username,String pwd,String Con_pwd) {
		//Rdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Username.sendKeys(username);
		password.sendKeys(pwd);
		cnf_password.sendKeys(Con_pwd);
	}
	
	public void Click_on_registerBtn() {
		register_Btn.click();
	}
	
	public String getpageTitle()
	{
		return Rdriver.getTitle();
	}
	
	public String geterrmsg_username() 
	{
		JavascriptExecutor js = (JavascriptExecutor) Rdriver;
		//Boolean isValidInput = (Boolean)js.executeScript("return arguments[0].checkValidity();", Username);
		String validationMessage = (String)js.executeScript("return arguments[0].validationMessage;", Username);
		return validationMessage;
	}
	
	public String get_registername() {
		Rdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return registername_name.getText();
	}
	
	public String get_successmsg() {
		Rdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return success_msg.getText();
	}
	
	public String get_errsmsg() {
		Rdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return err_msg.getText();
	}
	
	
}
