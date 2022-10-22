package stepDefinition;

import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DsalgoPortal_Page;
import pageObjects.Login_Page;
import utilities.Getdata_excel;
import utilities.ReadConfig;
import utilities.Util;

public class Steps_Login {
	
	public WebDriver driver;
	public Login_Page Lp;
	public DsalgoPortal_Page DP;
	private static Logger logger =  LogManager.getLogger();
	
	List<HashMap<String,String>> dataSet =
			Getdata_excel.readExcelDatafromFile("./Excel_file/dsalgo_testdata.xls", "Login");
	
	@Before
	 public void openbrowser()
	 {
		String Browser = ReadConfig.getBrowser();
		if (Browser.equals("chrome")) 
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\first-project\\Ds-algo_Cucumber\\Drivers\\chromedriver.exe");	
		driver = Util.getChromeDriver();
		}
		else if(Browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Workspace\\first-project\\Ds-algo_Cucumber\\Drivers\\geckodriver.exe");	
			driver = new FirefoxDriver();
		}
		/*else if (Browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Divya\\eclipse-workspace\\DS-Algo\\src\\test\\resources\\Driver\\chromedriver.exe");	
			driver = new EdgeDriver();
		}*/
	 }
	
	
	@Given("Launch chrome Browser")
	public void launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");	
		 driver = Util.getChromeDriver();
		 Lp = new Login_Page(driver);
		 DP = new DsalgoPortal_Page(driver);
	}

	@When("User Opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		logger.info("Opened the given url");
	}

	@When("Click on Getstarted Button")
	public void click_on_getstarted_button() {
	    DP.Click_on_getstarted();
	}
	@When("Click on Sigin")
	public void click_on_sigin() {
	    Lp.Click_on_Sigin();
	}

	@When("Click on LoginButton")
	public void click_on_login_button() {
	   Lp.Click_on_Login();
	}

	//@Then("It should display an error {string} below Username textbox")
	//public void it_should_display_an_error_below_username_textbox(String string) {
		
	//}

	@When("User Enters Login data as in {int}")
	public void user_enters_login_data_as_in(Integer excelDataRow) {
		 int dataRow = excelDataRow-1;
		 Lp.SetLoginData(dataSet.get(dataRow).get("username"), dataSet.get(dataRow).get("password"));
	}

	@Then("The user should be redirected to Home Page with the message {string} and with the user name on the top")
	public void the_user_should_be_redirected_to_home_page_with_the_message_and_with_the_user_name_on_the_top(String string) {
	   
	}
	@When("close the browser")
	public void close_the_browser() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Util.closeChromeDriver();
	}
	@When("Click on signout")
	public void Click_on_signout() {
	    Lp.Click_on_signout();
	    logger.info("User signout");
	}
}
