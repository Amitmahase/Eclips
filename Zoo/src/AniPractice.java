import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AniPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.hotels.com/");
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//input[@name='q-destination']"))).click().keyDown(Keys.SHIFT).sendKeys("Bangalore").build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q-destination']")).sendKeys(Keys.ARROW_DOWN);
		
		driver.findElement(By.xpath("//input[@name='q-destination']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		driver.findElement(By.xpath("//*[@id=\"0\"]/div/a")).click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it =ids.iterator();
		
		
		String PID=it.next();
		String CID=it.next();
		
		driver.switchTo().window(CID);
		
		driver.findElement(By.xpath("//button[@class='_3hkrim']")).click();
		
		for(int i=1;i>9;i++)
		{
		driver.findElement(By.xpath("//button[@class='_3hkrim']")).click();
		Thread.sleep(10000);
		}
		
		driver.switchTo().window(PID);
		driver.getTitle();
		
		driver.close();
	
		

	}

}
