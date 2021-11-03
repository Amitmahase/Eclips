import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	WebDriver driver;
	Properties pro;{
	
		pro=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\eikamum\\eclipse-workspace\\Revesion\\src\\input.properties");
	
		
		pro.load(fis);
	String browsername=pro.getProperty("browser");
	browsername=browsername.toLowerCase();
	if(browsername=="chrome");
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chronedriver.exe");
		driver=new ChromeDriver();
				
		
	}
		}
}
