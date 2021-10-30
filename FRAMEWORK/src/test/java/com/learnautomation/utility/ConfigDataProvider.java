package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	public ConfigDataProvider() {
		
		File src=new File("./Config/Config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			
			pro.load(fis);
		} catch (Exception e) {
			
			System.out.println("Not able to load config file>> "+ e.getMessage());
		
		}
	}
	
	public String getDataFormConfig(String KeyToSerch)
	{
		return pro.getProperty(KeyToSerch);
	}
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	
	}
	public String getStringUrl()
	{
		return pro.getProperty("qaUrl");
	}

	public String getStringname()
	{
		
		return pro.getProperty("FirstName");
	}
}
