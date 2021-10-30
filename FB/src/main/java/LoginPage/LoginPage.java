package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	By email=By.id("email");
	By password= By.xpath("//input[@type='password']");
	By login= By.name("login");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement email() {
		
		return driver.findElement(email);
	}
	
	public  WebElement password()
	{
		return driver.findElement(password);
		
	}
	public WebElement login()
	{
		return driver.findElement(login);  
	}
		
		
	}


