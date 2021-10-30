

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver, 6);

		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
		
				w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("results"))));
				
			System.out.println(driver.findElement(By.id("results")).getText());
				
				

	}

}
