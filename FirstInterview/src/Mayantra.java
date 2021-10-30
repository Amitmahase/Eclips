import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mayantra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.myntra.com/handcraftedjew20_887946");

		List<WebElement> products = driver.findElements(By.xpath("//ul[@class='results-base']/li/a/div[2]/h3"));

		int count = products.size();

		System.out.println(count);
		for (int i = 0; i < count; i++) {
			if ((products.get(i).getText()).contains("Voylla")) {

				products.get(i).click();

				break;

			}

		}

	}

}
