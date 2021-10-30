import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(o);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.id("FromSector_show")).clear();
		driver.findElement(By.id("FromSector_show")).sendKeys("che");
		Thread.sleep(2000);
		
		driver.findElement(By.id("FromSector_show")).sendKeys(Keys.ARROW_DOWN);
		
		driver.findElement(By.id("FromSector_show")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("Editbox13_show")).clear();
		driver.findElement(By.id("Editbox13_show")).sendKeys("BLR");
		Thread.sleep(2000);
		driver.findElement(By.id("Editbox13_show")).sendKeys(Keys.ENTER);
		
		
	}

}
