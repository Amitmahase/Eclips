import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		
		//a.moveToElement(By.id("nav-link-accountList")).
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Anima").build().perform();	
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN,Keys.SHIFT,"teddy love");
		Thread.sleep(3000);
		
		
		

	}

}
