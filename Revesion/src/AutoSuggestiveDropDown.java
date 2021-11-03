import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("in");
		
		List <WebElement> country=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		int count=country.size();
		
		
		
		for( WebElement c:country)
		{
			if(c.getText().equalsIgnoreCase("dominica"))
			{
				c.click();
				break;
			}
			
		}
		
		
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_SeniorCitizenDiscount']")).isSelected());

		List <WebElement> chk=driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling::label"));
		
		for(WebElement wo:chk)
		{
			if(wo.getText().equalsIgnoreCase("student"))
			{
				wo.click();
				break;
			}
			}
		
		
		
		
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		
		
		
		}
	
	
	}


