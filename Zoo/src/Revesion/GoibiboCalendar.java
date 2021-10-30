package Revesion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoibiboCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");

		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("IXB");
		Thread.sleep(2000);
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

		driver.findElement(By.id("gosuggest_inputDest")).sendKeys("BLR");
		Thread.sleep(2000);
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);

		// driver.findElement(By.id("gi_search_btn")).click();

		
		int co=driver.findElements(By.className("DayPicker-Day")).size();
		
		for(int i=0;i<co;i++)
		{
			String date=driver.findElements(By.className("DayPicker-Day")).get(i).getText();
			
			if(date.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("DayPicker-Day")).get(i).click();
				
			}
			
		}
		
		
		driver.findElement(By.xpath("//div[@class=\"DayPicker-Months\"]/div/div/div")).getText().contains("October");
		while(!driver.findElement(By.xpath("//div[@class=\"DayPicker-Months\"]/div/div/div")).getText().contains("October")) {
			
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
	}

}
