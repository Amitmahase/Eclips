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

public class Work {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://qaclickacademy.com/");
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		int links = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"))
				.findElements(By.tagName("a")).size();
		// driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]")).findElements(By.tagName("a")).get(i).click();

		Actions act = new Actions(driver);

		for (int i = 1; i < links; i++) {

			act.keyDown(Keys.CONTROL).build().perform();
			driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]")).findElements(By.tagName("a"))
					.get(i).click();
			Thread.sleep(2000);

		}
		Set<String> ids = driver.getWindowHandles(); // 4
		Iterator<String> it = ids.iterator();
		String PID=it.next();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		driver.switchTo().window(PID);
		//driver.findElement(By.xpath("//body/header/div/a/button")).click();
		//driver.findElement(By.xpath("//*[text()='Practice']")).click();

		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='Practice']")).click();
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
	}

}
