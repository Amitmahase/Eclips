import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/recaptcha/api2/demo");
		
		int number = findFramenumber(driver,By.xpath("//div[@class='recaptcha-checkbox-border']"));
		driver.switchTo().frame(number);
		
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		
		driver.switchTo().defaultContent();
		
		
		int number1 = findFramenumber(driver,By.xpath("//div[@class='recaptcha-checkbox-border']"));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath("//button[@class='rc-button-default goog-inline-block']")).click();

	}
		// driver.findElement(By.id("recaptcha-demo-form"));
		// driver.switchTo().frame("recaptcha-demo-form");

		/*int count = driver.findElements(By.tagName("iframe")).size();
		for (int i = 0; i < count; i++) {

			driver.switchTo().frame(i);
			int count1 = driver.findElements(By.xpath("//div[@class='recaptcha-checkbox-border']")).size();

			if (count1 > 0) {

				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
				break;
			}

		}
		driver.switchTo().defaultContent();

		// recaptcha challenge

		for (int j = 0; j<count; j++) {

			driver.switchTo().frame(j);
			int count2 = driver.findElements(By.xpath("//button[@class='rc-button-default goog-inline-block']")).size();

			if (count2 > 0) {

				driver.findElement(By.xpath("//button[@class='rc-button-default goog-inline-block']")).click();
				break;
			}*/

	public static int findFramenumber(WebDriver driver, By by) {
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();

		for (i = 0; i < framecount; i++) {
			driver.switchTo().frame(i);
			int count = driver.findElements(by).size();
			if (count > 0) {
				break;
			} else {
				System.out.println("continue looping");
			}

		}
		driver.switchTo().defaultContent();
		return i;

	}
	}
	
