import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandsDirty {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://qaclickacademy.com/");
		// driver.findElement(By.xpath("//div[@class='sumome-react-wysiwyg-move-handle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		driver.findElement(By.xpath("//input[@value='radio2']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys("Amit Kumar");

		Select a = new Select(driver.findElement(By.id("dropdown-class-example")));
		a.selectByValue("option2");
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(3000);
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String PID = it.next();
		String CID = it.next();

		driver.switchTo().window(CID);
		System.out.println(driver.getTitle());
		driver.switchTo().window(PID);

		Thread.sleep(3000);
		driver.findElement(By.id("opentab")).click();
		Thread.sleep(3000);
		driver.switchTo().window(PID);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Amit");

		driver.findElement(By.id("alertbtn")).click();

		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Amit");

		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		System.out.println(driver.findElements(By.tagName("a")).size());

		/*
		 * System.out.println(driver.findElement(By.
		 * xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']"))
		 * .findElements(By.tagName("a")).size());
		 * 
		 * System.out.println(driver .findElement(By.
		 * xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']/table/tbody/tr/td"
		 * )) .findElements(By.tagName("a")).size());
		 * 
		 * System.out.println(driver.findElement(By.
		 * xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']"))
		 * .findElement( By.
		 * xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']/table/tbody/tr/td[3]/ul"
		 * )) .findElements(By.tagName("a")).size());
		 */

		WebElement foot1 = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		int links = foot1.findElements(By.tagName("a")).size();
		System.out.println(links);

		Actions act = new Actions(driver);

		for (int i = 0; i < links; i++) {

			act.keyDown(Keys.CONTROL).build().perform();
			foot1.findElements(By.tagName("a")).get(i).click();
		}// this for loop is opening all the tabs.

		Set<String> idss = driver.getWindowHandles();
		Iterator<String> itt = idss.iterator();
		while (itt.hasNext()) {
			driver.switchTo().window(itt.next());
			System.out.println(driver.getTitle());

		}// this while loop is iterating all the tabs one by one.

	}
}
