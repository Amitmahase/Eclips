import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Paytm {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://paytm.com/");

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Paytm for Consumer']"))).build().perform();
		Thread.sleep(5000);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Paytm For Business']"))).build().perform();
		Thread.sleep(5000);
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Company']"))).build().perform();
		
		

	}

}
