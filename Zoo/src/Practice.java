import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()='Tabs']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='google_esf']")));
		driver.findElement(By.xpath("//div[@id='accordion']/h3[2]")).click();
		driver.findElement(By.xpath("//div[@id='accordion']/h3[2]")).getText();
		
		
		

	}

}
