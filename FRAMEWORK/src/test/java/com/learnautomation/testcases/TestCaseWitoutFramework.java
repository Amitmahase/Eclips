package com.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseWitoutFramework {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");
		
		driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']")).click();
		Thread.sleep(3000L);
		driver.findElement(By.name("email")).sendKeys("animation.gmail.com");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		// TODO Auto-generated method stub

	}

}
