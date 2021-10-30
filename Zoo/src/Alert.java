import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[text()='Beginner Tutorial']")).click();
		System.out.println(driver.getTitle());

	}

}
