import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdrive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.practo.com/");
		WebElement serch = driver.findElement(By.xpath("//input[@data-input-box-id='omni-searchbox-keyword']"));

		serch.sendKeys("Dentist");
		Thread.sleep(2000);
		serch.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

	
		  WebDriverWait w=new WebDriverWait(driver, 20);
		  w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.
		 xpath("//h2[text()='Dr. Smitha Shetty']"))));
		driver.findElement(By.xpath("//h2[text()='Dr. Smitha Shetty']"));
				  
				//driver.findElement(By.xpath("//button[@data-qa-id='book_button']")).click(); 
				
				driver.findElement(By.xpath("//h2[text()='Dr. Smitha Shetty'] //button[@data-qa-id='book_button']")).click();

		
				 
	}

}
