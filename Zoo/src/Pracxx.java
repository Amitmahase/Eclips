import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Pracxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		
		driver.findElement(By.id("checkbox-example")).
		
		Select s= new Select(driver.findElement(By.id("dropdown-class-example")));
		
		
		
		
			
		}

	}

