import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\eikamum\\\\\\\\Desktop\\\\\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement ani =driver.findElement(By.xpath("//input[@title='Search']"));
	//ani.sendKeys(Keys.ARROW_DOWN);
	//ani.sendKeys(Keys.SHIFT);
	
	ani.sendKeys("Animatio");
	ani.sendKeys(Keys.ENTER);
	
	
	
	
	

	}

}
