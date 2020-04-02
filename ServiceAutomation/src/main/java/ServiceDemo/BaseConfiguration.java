package ServiceDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfiguration {
	
	
	public String getHosturl(String url) throws IOException
	{
		FileInputStream file=new FileInputStream("/Users/568650/Documents/Selenium/ServiceAutomation/src/main/java/ServiceDemo/ServiceAutomationConfiguration/config.properties");
		
		Properties prop=new Properties();
		
		prop.load(file);
		
		String value=prop.getProperty(url);
		
		return value;
		
		
		
		
	}

}
