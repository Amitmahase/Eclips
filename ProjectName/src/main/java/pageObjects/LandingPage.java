package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
		By signin= By.xpath("//span[text()='Login']");
		By title=By.xpath("//h2[text()='Featured Courses']");
		By Navigationbar= By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[3]"); 
		
		
		
		
		public LandingPage(WebDriver driver) {
			
			this.driver=driver;
		
		}

		public WebElement getLogin()
		{
			
			return driver.findElement(signin);
			
		}
		public WebElement getTitle()
		{
			
			return driver.findElement(title);
			
		}
		public WebElement Navigation()
		{
			
			return driver.findElement(Navigationbar);
			
		}
		
		
	

}
