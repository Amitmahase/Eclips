import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoIb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");

		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("IXB");
		Thread.sleep(2000);
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys("BLR");
		Thread.sleep(2000);
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Mon Oct 04 2021']")).click();
		
		driver.findElement(By.id("gi_search_btn")).click();
		WebDriverWait w=new WebDriverWait(driver, 20);
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(By.xpath(\"//div[@aria-label='Mon Oct 04 2021']\"))"))
	}

}
