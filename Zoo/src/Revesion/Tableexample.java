package Revesion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.nseindia.com/market-data/top-gainers-loosers");
		
		System.out.println("all cookies has been deleated");

		//WebElement table =driver.findElement(By.id("topgainer-Table"));
		//System.out.println(table.findElement(By.xpath("//*[@id=\"topgainer-Table\"]/tbody/tr/td-child:td[1]")).getText());

	}

}
