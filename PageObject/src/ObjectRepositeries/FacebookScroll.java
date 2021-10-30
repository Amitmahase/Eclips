package ObjectRepositeries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookScroll {

	
	//https://en-gb.facebook.com/login/
	
	
	WebDriver driver;
	
	public FacebookScroll(WebDriver driver)
	{
		this.driver=driver;
	}
		By username =By.id("email");
		By password=By.name("pass");
		By login =By.name("login");
		By ForgetPassword= By.linkText("Forgotten account?");
		
		
		public WebElement EmailID()
		{
			return driver.findElement(username);
		}
		public WebElement Password()
		{
			return driver.findElement(password);
		}
		public WebElement Login()
		{
			return driver.findElement(login);
		}
		public WebElement ForgotPass()
		{
			return driver.findElement(ForgetPassword);
		}
}

