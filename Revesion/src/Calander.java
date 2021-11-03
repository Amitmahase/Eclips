import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calander {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//*[text()=' Pakyong (PYG)']")).click();

		driver.findElement(By.xpath("(//*[text()=' Chennai (MAA)'])[2]")).click();
		

		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
		driver.findElement(By.xpath("//div[@class='paxinfo']")).click();
		int i = 0;
		while (i < 3) {
			driver.findElement(By.id("hrefIncAdt")).click();

			driver.findElement(By.id("hrefIncChd")).click();
			driver.findElement(By.id("hrefIncInf")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();

		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByVisibleText("AED");

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
