import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadBySelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com");

		driver.findElement(By.id("login_Layer")).click();

		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"))
				.sendKeys("amitmahaseth1992@gmail.com");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mahaseth9650@");

		driver.findElement(By.xpath("//button[text()='Login']")).click();

		//WebDriverWait W = new WebDriverWait(driver, 20);
		//W.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//div[text()='My Naukri']"))));
Thread.sleep(3000);
		Actions a = new Actions(driver);

		WebElement mynauk = driver.findElement(By.xpath("//div[text()='My Naukri']"));

		Thread.sleep(2000);

		a.moveToElement(mynauk).build().perform();

		driver.findElement(By.xpath("//a[@title='Edit Profile']")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("attachCV")).sendKeys("C:\\Users\\eikamum\\Desktop\\Amit_Kumar_Resume.docx");

	}

}
