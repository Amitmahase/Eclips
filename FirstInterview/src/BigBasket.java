import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.bigbasket.com/");

		List<WebElement> products = driver.findElements(By.xpath("//div[@class='owl-pd clearfix']/div[4]/div/a"));
		int count = products.size();

		for (int i = 0; i < count; i++) {

			
			
			
			
			
			if ((products.get(i).getText()).contains("Onion")) {
				products.get(i).click();
				break;
			}

		}

	}

}
