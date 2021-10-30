package Revesion;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://accounts.google.com/");
		driver.findElement(By.xpath("//a[text()='Help']")).click();

		Set<String> id = driver.getWindowHandles();

		Iterator<String> it = id.iterator();
		String Pid = it.next();
		String Cid = it.next();
		driver.switchTo().window(Cid);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Google Account']"));
		driver.switchTo().window(Pid);
		System.out.println(driver.getTitle());

	}

}
