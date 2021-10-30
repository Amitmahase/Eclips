package Revesion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IAmNotRobot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.google.com/recaptcha/api2/demo");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		driver.findElement(By.xpath("//div[@role='presentation']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='recaptcha challenge']")));
		Thread.sleep(2000);
		driver.findElement(By.id("recaptcha-verify-button")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		

	}

}
