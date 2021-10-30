import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class asaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		

		Select S1=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		S1.selectByVisibleText("INR");
		S1.selectByValue("USD");
		System.out.println(S1.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("divpaxinfo")).click();
		//driver.findElement(By.id("divAdult")).click()
		
		for(int i=0;i<4;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("BLR",Keys.ENTER);
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("MAA", Keys.ENTER);
		
		driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]")).click();
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
	}

} 
