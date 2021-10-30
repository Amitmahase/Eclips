import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Revesion {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(" https://ep.ss.sw.ericsson.se/irj/portal/standards");
		
		driver.findElement(By.xpath("//span[text()='Record Working Time']")).click();
		Thread.sleep(8000);
		
		driver.switchTo().frame(driver.findElement(By.id("fullPageDiv")));
		

	}

}
