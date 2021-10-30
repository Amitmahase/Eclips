import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dragon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		/*
		 * driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		 * 
		 * driver.findElement(By.xpath("//button[text()='Try it']")).click();
		 * System.out.println(driver.switchTo().alert().getText());
		 */

		int count = driver.findElements(By.tagName("iframe")).size();

		for (int i = 0; i < count; i++) {
			driver.switchTo().frame(i);
			System.out.println(driver.getTitle());

		}
		
		driver.switchTo().defaultContent();

	}

}
