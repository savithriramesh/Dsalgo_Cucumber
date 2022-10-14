package pageObjects;

import java.time.Duration;

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
	
	public Register_page (WebDriver driver){
		Rdriver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void Click_on_register() {
		register_lnk.click();
	}
	
	public void SetregisterData(String username,String pwd,String Con_pwd) {
		Rdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Username.sendKeys(username);
		password.sendKeys(pwd);
		cnf_password.sendKeys(Con_pwd);
	}
	
	public void Click_on_registerBtn() {
		register_Btn.click();
	}

}
