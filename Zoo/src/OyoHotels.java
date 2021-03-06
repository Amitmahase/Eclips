import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OyoHotels {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// implicit
		// wait define globally.. and it will
		// work till driver works.

		driver.manage().window().maximize();
		driver.get("https://www.oyorooms.com/");
		WebElement hotelSerch = driver
				.findElement(By.xpath("//input[@placeholder='Search by city, hotel, or neighborhood']"));

		hotelSerch.sendKeys("Bangalore");

		Thread.sleep(2000);

		hotelSerch.sendKeys(Keys.ARROW_DOWN);
		hotelSerch.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[@class='u-textCenter searchButton searchButton--home']")).click();
		
		

		WebDriverWait d = new WebDriverWait(driver, 25);

		d.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h3[text()='OYO 69014 The New Golden Keys']")));
		driver.findElement(By.xpath("//h3[text()='OYO 69014 The New Golden Keys']")).click();
		// driver.switchTo().Window();

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String ChildId = it.next();
		driver.switchTo().window(ChildId);

		driver.getTitle();

		for (int i = 1; i <= 10; i++) {

			driver.findElement(By.xpath("//button[@class='slick-arrow slick-next']")).click();
			Thread.sleep(2000);
		}

		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//div[@class='headerSearchWidget__comp headerSearchWidget__dateRangePicker']"))
				.click();

		/*
		 * for (int j = 0; j < 12; j++) { boolean month =
		 * driver.findElement(By.className(
		 * "//div[@class='DateRangePicker__MonthHeader']")).getText()
		 * .contains("September"); while (!month) { driver.findElement(By.xpath(
		 * "//div[@class='DateRangePicker__PaginationArrow DateRangePicker__PaginationArrow--is-disabled DateRangePicker__PaginationArrow--previous DateRangePicker__PaginationArrow--previous--is-disabled']"
		 * )) .click();
		 * 
		 * break; } }
		 */

		driver.findElement(By.xpath("//span[text()='7']")).click();
		driver.findElement(By.xpath("//span[text()='15']")).click();

		/*
		 * List<WebElement> dates = driver.findElements(By.xpath(
		 * "//table[@class='DateRangePicker__MonthDates']/tbody/tr[2]//span[@class='DateRangePicker__DateLabel']"
		 * )); int count = dates.size(); System.out.println(count); for (int k = 0; k <
		 * count; k++) { String text = dates.get(k).getText(); if
		 * (text.equalsIgnoreCase("23")) { dates.get(k).click(); }
		 * 
		 * }
		 */

	}
}
