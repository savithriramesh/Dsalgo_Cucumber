package stepDefinition;

import java.util.HashMap;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import io.cucumber.java.en.*;
import pageObjects.Register_page;
import utilities.Getdata_excel;
import utilities.Util;

public class Step_Register extends Util {
	
	public Register_page rp = new Register_page(getChromeDriver());
	private static Logger logger =  LogManager.getLogger();
	
	List<HashMap<String,String>> dataSet1 = Getdata_excel.readExcelDatafromFile("C:\\Workspace\\first-project\\Ds-algo_Cucumber\\Excel_file\\dsalgo_testdata.xls", "Register");
	

	@When("Click on Register")
	public void click_on_register() {
		
	    rp.Click_on_register();
	}
	

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		
	    Assert.assertEquals( rp.getpageTitle(),"Registration");
	    logger.info("User is On Register Page");
	}

	@When("Enter Username Password and Confirm password {int}")
	public void enter_username_password_and_confirm_password(Integer excelDataRow) {
		int dataRow = excelDataRow-1;
		 rp.SetregisterData(dataSet1.get(dataRow).get("Username"), dataSet1.get(dataRow).get("Password"),dataSet1.get(dataRow).get("Confirm_Pwd"));
	}
	
	@When("Click on Register Button")
	public void click_on_register_button() {
	    rp.Click_on_registerBtn();
	    logger.info("User Registered");
	}

	@Then("The user should be redirected to Homepage with the message {string} username {int}")
	public void the_user_should_be_redirected_to_homepage_with_the_message_username(String string, Integer excelDataRow) {
		Assert.assertEquals("NumpyNinja", rp.getpageTitle());
		int dataRow = excelDataRow-1;
		String UserName = dataSet1.get(dataRow).get("Username");
		String Actual_UN = "New Account Created. You are logged in as "+UserName;
		String Expected_UN = rp.get_successmsg();
		Assert.assertEquals(Actual_UN, Expected_UN);
		logger.info("User redirected to Homepage with the message Registered");
	}
	
	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String exp_errmsg) {
		String Actual_errmsg = rp.geterrmsg_username();
		Assert.assertEquals(Actual_errmsg, exp_errmsg);
	}
	
	@Then("Error message should be as {string}")
	public void error_message_should_be_as(String exp_errmsg) {
		String Actual_errmsg = rp.get_errsmsg();
		Assert.assertEquals(Actual_errmsg, exp_errmsg);
		 logger.info("User check for the error msg");
	}
	
	@When("user enter usename {int}")
	public void user_enter_usename(Integer excelDataRow) {
		 int dataRow = excelDataRow-1;
		 rp.set_username(dataSet1.get(dataRow).get("Username"));
	}
	
}