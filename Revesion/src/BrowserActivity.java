import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://google.co.in");
		
		
		driver.navigate().to("https://facebook.com");
		
		System.out.println(driver.getTitle());

		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
	}

}
