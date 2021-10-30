package Test;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DataDriven2 {

	public WebDriver driver= null;

	@Test
	public void Login() throws IOException
	{
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\eikamum\\eclipse-workspace\\TestNGTutorial\\src\\Test\\datadriver.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("url"));
		if(prop.getProperty("browswe").equals("chrome"))
		{
			
			driver=new ChromeDriver();
			
		}
		
		else if (prop.getProperty("browswe").equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			 driver=new InternetExplorerDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	
}