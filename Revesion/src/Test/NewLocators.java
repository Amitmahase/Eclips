package Test;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewLocators {

	WebDriver driver;

	@BeforeSuite

	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice");

	}

	@Test(groups= {"smoke"})

	void EnterName() {

		driver.findElement(By.name("name")).sendKeys("Amit");
		

	}
	@Test(groups= {"smoke"})

	void EnterMail() {

		driver.findElement(By.name("email")).sendKeys("Animation@gmail.com");
		

	}
	
	@Test

	void EnterPass() {

		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
		
		TakesScreenshot scrShot =(TakesScreenshot)driver;
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	}
	
	@AfterTest
	void cleanup()
	{
		
		driver.navigate().refresh();
		
	}
	
	
	

}
