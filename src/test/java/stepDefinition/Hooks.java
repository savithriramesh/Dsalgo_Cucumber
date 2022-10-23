package stepDefinition;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks {
	
	protected static WebDriver driver;
	private static Logger logger =  LogManager.getLogger();
	static List<String> filePaths = new ArrayList<String>();	
	static String destFilePath;
	
	@After
	public void endTest(Scenario scenario) {
		if (scenario.isFailed()) {

			try {
				
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				boolean isfailed = false;
				TakeScreenshot(scenario.getName(),driver);
				logger.info("Scenario failed");
				 Allure.addAttachment(scenario.getName(), new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
			} catch (WebDriverException e) {
				e.printStackTrace();
			}
			//driver.quit();
		} 
		
		
		
	}
	
	// Method to take Screen shot
	public static String TakeScreenshot(String methodName, WebDriver driver) {
		
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File src = screenShot.getScreenshotAs(OutputType.FILE);
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
