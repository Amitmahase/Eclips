import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Spjj {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://beta.spicejet.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).sendKeys("IXBbbbb");
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div")).sendKeys("MAA");
		Thread.sleep(2000);;
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div")).sendKeys(Keys.ENTER);*/
		
		

	}

}
