import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoIbibo {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.booking.com/");
		WebElement destination= driver.findElement(By.xpath("//input[@id='ss']"));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions a=new Actions(driver);
		a.moveToElement(destination).click().keyDown(Keys.SHIFT).sendKeys("Bangalore").build().perform();
		Thread.sleep(2000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//div[@class='sb-searchbox-submit-col -submit-button ']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"hotellist_inner\"]/div[1]/div[2]/div[1]/div[1]/div[1]/h3/a/span[1]")).click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String ParentID=it.next();
		String ChildID=it.next();
		driver.switchTo().window(ChildID);
		
		driver.findElement(By.xpath("//span[@class='bh-photo-grid-thumb-more-inner-2']")).click();
		
		driver.findElement(By.xpath("//button[text()='Rooms (17)']")).click();
		
		//a.moveToElement(driver.findElement(By.xpath("//img[@class='bh-photo-modal-grid-image']"))).keyDown(Keys.ARROW_DOWN).build().perform();
		
		
		
		
			

	}

}
