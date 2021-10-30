package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendMsg {
	
	public WebDriver driver;
	
	By msg=By.xpath("//span[text()='Message']");
	By send=By.xpath("//div[@class='j83agx80 thccjwpm']");
	
	
	public SendMsg(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement sendms()
	{
		
		return driver.findElement(msg);
	}
	
	public WebElement send()
	{
		
		return driver.findElement(send);
	}
}
