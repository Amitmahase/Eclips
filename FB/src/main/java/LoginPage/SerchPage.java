package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SerchPage {
	
	
		public WebDriver driver;
		
		By Serchname=By.xpath("//input[@aria-label='Search Facebook']");
		
		public SerchPage(WebDriver driver)
		{
			this.driver=driver;
		}
		
		public WebElement serchname()
		
		{
			return driver.findElement(Serchname);
			
		}
		
		
		
		
		
		
	}

