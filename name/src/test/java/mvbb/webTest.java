package mvbb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class webTest {
	WebDriver driver;
	
	@Test(groups= {"smoke"})
	public void mob()
	{
		
		System.out.println(driver.getTitle() + " "+ driver.getCurrentUrl());
		
		
	}
	
	
	@BeforeSuite(groups= {"smoke"})
	
	public void rrrr()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://google.co.in");
		
		
	}
}
