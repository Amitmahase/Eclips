package Revesion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_from")).sendKeys("blr");
		Thread.sleep(2000);
		driver.findElement(By.id("travel_from")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		
		driver.findElement(By.id("travel_to")).sendKeys("MAA");
		Thread.sleep(2000);
		
		driver.findElement(By.id("travel_to")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		
		driver.findElement(By.name("travel_date")).click();
		
		//int count=driver.findElements(By.xpath("//table[@class='table-condensed']/tbody/tr/td")).size();
		
		String mon=driver.findElement(By.className("datepicker-switch")).getText();
		while(!mon.equalsIgnoreCase("December 2021"))
		{
			driver.findElement(By.xpath("//table[@class='table-condensed']/thread/tr/th[3]")).click();
			
		}
		
		List<WebElement> dates=driver.findElements(By.className("day"));
		int count=driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++)
		{
			String date=driver.findElements(By.className("day")).get(i).getText();
			
			if(date.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		
	}

}
