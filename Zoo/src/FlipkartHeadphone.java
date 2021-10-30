import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHeadphone {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9650865177");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("MAhaseth");

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		
		
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("wired headphones with microphones");
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Boult Audio Bassbuds X1 Wired Headset']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[8]/div[3]/div/div[2]/div[2]/div[2]/button")).click();
		//Actions a=new Actions(driver);
		
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//body/div/div/div[3]/div/div[2]/div[3]/div/div[2]")).click();
		//a.moveToElement(driver.findElement(By.xpath("//span[text()='Home & Furniture']"))).build().perform();
		
	}

}
