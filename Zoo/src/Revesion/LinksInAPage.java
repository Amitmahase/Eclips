package Revesion;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksInAPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());

		// System.out.println(driver.findElements(By.id("gf-BIG")).size());

		WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr"));

		System.out.println(footer.findElements(By.tagName("a")).size());

		WebElement section1 = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td/ul"));
		System.out.println(section1.findElements(By.tagName("a")).size());
		int count = section1.findElements(By.tagName("a")).size();

		// 1 way to get title and link open
		/*
		 * for (int i = 0; i < count; i++) {
		 * 
		 * // String clickonlink= Keys.chord(Keys.CONTROL, Keys.ENTER);
		 * section1.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,
		 * Keys.ENTER); // section1.findElements(By.tagName("a")).get(i).click();
		 * Thread.sleep(2000);
		 * 
		 * Set<String> id = driver.getWindowHandles(); Iterator<String> it =
		 * id.iterator();
		 * 
		 * String Pid = it.next(); String Cid = it.next();
		 * driver.switchTo().window(Cid); System.out.println(driver.getTitle());
		 * driver.close(); driver.switchTo().window(Pid); }
		 */

		// 2nd way to get title and link open

		for (int j = 0; j < count; j++) {
			section1.findElements(By.tagName("a")).get(j).sendKeys(Keys.CONTROL, Keys.ENTER);
			Thread.sleep(2000);
		}

			Set<String> id = driver.getWindowHandles();
			Iterator<String> it = id.iterator();
			
			String Pid= it.next();
		
			while (it.hasNext()) {
				
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
				driver.switchTo().window(Pid);
				}
		}

	}


