package stepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {
	
	protected static WebDriver driver;
	
	static List<String> filePaths = new ArrayList<String>();	
	static String destFilePath;
	
	@After
	public void endTest(Scenario scenario) {
		if (scenario.isFailed()) {

			try {
				
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				boolean isfailed = false;
				TakeScreenshot(scenario.getName(),driver);
			} catch (WebDriverException e) {
				e.printStackTrace();
			}

		} 
		//driver.quit();
		
		
	}
	
	// Method to take Screen shot
	public static String TakeScreenshot(String methodName, WebDriver driver) {
		
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File src = screenShot.getScreenshotAs(OutputType.FILE);
		//Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		//String time = timestamp.toString().replace(":", "_").replace(" ", "_");
		String dir = System.getProperty("user.dir");
		
		destFilePath = dir + "/Screenshots/" + methodName + ".png";
		try {
			FileUtils.copyFile(src, new File(destFilePath));
			filePaths.add(destFilePath);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return destFilePath;
	} 

}
