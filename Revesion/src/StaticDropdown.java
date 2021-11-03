
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		// driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		// Select s=new
		// Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));

		// s.selectByVisibleText("AED");

		Select s = new Select(driver.findElement(By.tagName("select")));
		s.selectByVisibleText("India");
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByIndex(0);

		s.selectByVisibleText("Libya");
		Thread.sleep(2000);

		s.deselectByVisibleText("Libya");

		// s.selectByIndex(10);

	}

}
