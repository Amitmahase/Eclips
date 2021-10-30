import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Goolge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://google.co.in");
		
		//driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Animation", Keys.ENTER);
		
		WebElement ani=driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/style/following-sibling::input"));
		
		ani.sendKeys("Animation", Keys.ENTER);
		
		WebDriverWait w=new WebDriverWait(driver, 20);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h3[text()='Animation - Wikipedia']")).click();
		
		driver.navigate().back();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Animation movies", Keys.ENTER);
		
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
				

	}

}
