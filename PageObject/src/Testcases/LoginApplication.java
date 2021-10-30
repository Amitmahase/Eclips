package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepositeries.FacebookLoginPage;



public class LoginApplication {
	WebDriver driver;
	@Test
	
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		driver=new  ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		
		FacebookLoginPage fb=new FacebookLoginPage(driver);
		
		fb.EmailID().sendKeys("amit@gmail.com");
		fb.Password().sendKeys("animam");
		//fb.ForgotPass().click();
		fb.Login().click();
		
	}
	
	
	
	

}
