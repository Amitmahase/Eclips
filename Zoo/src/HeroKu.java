import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeroKu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		
		Set<String> add=driver.getWindowHandles();
		Iterator<String> it=add.iterator();
		String PID=it.next();
		String CID=it.next();
		
		driver.switchTo().window(CID);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(PID);
		
		

	}

}
