import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.id("travel_date")).click();

		for (int j = 0; j < 12; j++) {
			boolean month = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"))
					.getText().contains("April");

			while (!month)
			{
				driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
				break;
			}
		}
		List<WebElement> dates = driver.findElements(By.className("day"));
		int count = dates.size();
		for (int i = 0; i <= count; i++) {
			String text = dates.get(i).getText();
			if (text.equalsIgnoreCase("16")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
	}

}
