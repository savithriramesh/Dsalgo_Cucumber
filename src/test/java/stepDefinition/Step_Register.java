package stepDefinition;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.Register_page;
import utilities.Getdata_excel;

public class Step_Register {
	
	public WebDriver driver;
	public Register_page Rp;
	
	List<HashMap<String,String>> dataSet = Getdata_excel.readExcelDatafromFile("C:\\Workspace\\first-project\\Ds-algo_Cucumber\\Excel_file\\dsalgo_testdata.xls", "Register");
	
	
	@When("Click on Register")
	public void click_on_register() {
		
		Rp.Click_on_register();
		
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		 Assert.assertEquals( Rp.getpageTitle(),"Registration");
	}

	@When("Click on Register Button")
	public void click_on_register_button() {
		Rp.Click_on_registerBtn();
	}
	

	@When("Enter Username Password and Confirm password {int}")
	public void enter_username_password_and_confirm_password(Integer excelDataRow) {
		int dataRow = excelDataRow-1;
		Rp.SetregisterData(dataSet.get(dataRow).get("Username"), dataSet.get(dataRow).get("Password"), dataSet.get(dataRow).get("ConfirmPassword"));
	}

	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String string) {
	}


}