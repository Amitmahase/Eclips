import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDothis {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(3000);

		
		WebElement frm=driver.findElement(By.id("iframewrapper"));
		driver.switchTo().frame(frm);
		
		driver.findElement(By.xpath("//button[onclick='myFunction()']")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().getText();
		// driver.switchTo().alert().dismiss();

	}

}
