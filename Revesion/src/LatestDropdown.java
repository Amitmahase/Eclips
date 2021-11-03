import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LatestDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//div[@class='paxinfo']")).click();
		int i = 0;
		while (i<3) {
			driver.findElement(By.id("hrefIncAdt")).click();

			driver.findElement(By.id("hrefIncChd")).click();
			driver.findElement(By.id("hrefIncInf")).click();
i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		//System.out.println(driver.switchTo().alert().getText());
		
		String s=driver.findElement(By.xpath("//div[@class='paxinfo']")).getText();
		System.out.println(s);

	}

}
