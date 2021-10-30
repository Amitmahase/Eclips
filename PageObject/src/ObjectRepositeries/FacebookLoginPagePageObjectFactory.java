package ObjectRepositeries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginPagePageObjectFactory {

	
	//https://en-gb.facebook.com/login/
	
	
	WebDriver driver;
	
	public FacebookLoginPagePageObjectFactory(WebDriver driver)
	{
		this.driver=driver;
		
		@FindBy(id="email")
		WebElement username;
		
		@FindBy(name="pass")
		WebElement password;
		
		#FindBy(name="login")
		WebElement login;
	}
	/*	By username =By.id("email");
		By password=By.name("pass");
		By login =By.name("login");
		By ForgetPassword= By.linkText("Forgotten account?");*/
		
		
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

