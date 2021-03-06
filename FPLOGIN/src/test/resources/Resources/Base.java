package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	WebDriver driver;
	public void initilizedriver() throws IOException {
		
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\eikamum\\eclipse-workspace\\FPLOGIN\\src\\test\\java\\Academy\\data.properties");
		
		prop.load(fis);
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.contains("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\eikamum\\Desktop\\chrome.driver");
			driver=new ChromeDriver();
			driver.get("https://google.co.in");
			
		}
		
		else if(browsername.contains("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\eikamum\\Desktop\\geckodriver.exe");
			driver=new ChromeDriver();
			driver.get("https://google.co.in");
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

}
