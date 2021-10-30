package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	public WebDriver driver;
	
	public WebDriver initilizeDriver() throws IOException
	{
	
	FileInputStream fis=new FileInputStream("C:\\Users\\eikamum\\eclipse-workspace\\Gmail\\src\\main\\java\\Utilities\\supportdata.properties");
	Properties pro=new Properties();
	pro.load(fis);
	String browserName=pro.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		}
	else
	{
		System.out.println("Currently browser is not installed");
		
		}
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
	
	
	
	}
}
