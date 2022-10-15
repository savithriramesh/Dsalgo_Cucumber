package utilities;

import org.openqa.selenium.chrome.ChromeDriver;


public class Util {
	private static ChromeDriver CHROME_DRIVER = null; 
	
	public static ChromeDriver getChromeDriver() {
    	if (CHROME_DRIVER == null) 
    		CHROME_DRIVER = new ChromeDriver(); 
        return CHROME_DRIVER;
    }
    
    public static void closeChromeDriver() {
    	if (CHROME_DRIVER != null) {
    		CHROME_DRIVER.close();
    		CHROME_DRIVER = null;
    	}
    }
}
