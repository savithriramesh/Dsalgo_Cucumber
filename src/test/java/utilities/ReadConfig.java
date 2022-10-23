package utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfig {
	private static Properties prop = new Properties();
	private static String pythoncode ;
	private static String Browser ;
	
	
	public static void readconfigproperties(){
		
		try {
			
			InputStream input = new FileInputStream("C:\\Workspace\\first-project\\Ds-algo_Cucumber\\configs\\Configuration.properties");
			prop.load(input);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		pythoncode = prop.getProperty("pythoncode");
		Browser = prop.getProperty("Browser");
	}
	
	public static String getpythoncode(){
		readconfigproperties();
		return pythoncode;
	}
	
	public static String getBrowser(){
		readconfigproperties();
		return Browser;
	}

}
