import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Pr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/locatorspractice");

		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("hello123");

		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());

		driver.findElement(By.linkText("Forgot your password?")).click();

		driver.findElement(By.xpath("//*[@placeholder='Name']")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rahul@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		String s = driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();

		String[] arr = s.split("'");
		String pass = arr[1];

		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		System.out.println(driver.getTitle());

		System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());
		// Thread.sleep(2000);

		driver.close();

	}

}
