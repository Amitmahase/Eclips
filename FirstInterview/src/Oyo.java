import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Oyo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(o);
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		
		

		driver.get("https://www.oyorooms.com/");
		
		driver.findElement(By.id("autoComplete__home")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.id("autoComplete__home")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		
		
		
		driver.findElement(By.xpath("//div[@data-cms-template='cWeb-Search']/div[4]/button")).click();
		
		WebDriverWait w=new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@class='ToggleButton__sliderRound']"))));
		
		
		List<WebElement> hotels=driver.findElements(By.xpath("//section[@class='listing__content']/div/div[2]/div/div/div[2]/div/div/div[2]/div/a/h3"));
		
int count=hotels.size();
		for(int i=0;i<count;i++)
		{
			
			System.out.println(hotels.get(i).getText());
			if ((hotels.get(i).getText()).contains("Sagar"))
					{
				
				
				driver.findElement(By.xpath("(//div[@class='oyo-row oyo-row--no-spacing']/div[2]/button[2]/span)[i]")).click();
				break;
				
					}
			
		}
	}

}
