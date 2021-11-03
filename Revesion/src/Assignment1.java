import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.cleartrip.com/");
		
	WebElement se=driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[1]"));
	Select s=new Select(se);
	s.selectByVisibleText("4");
	Thread.sleep(2000);
	
	WebElement s1= driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[2]"));
	Select s2=new Select(s1);
	s.selectByVisibleText("2");
	
	driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']")).click();
	
	driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--leftEdge DayPicker-Day--selected DayPicker-Day--today']")).click();
		

	}

}
