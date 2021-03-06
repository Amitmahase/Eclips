import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(
				"https://www.practo.com/search/doctors?results_type=doctor&q=%5B%7B%22word%22%3A%22Dentist%22%2C%22autocompleted%22%3Atrue%2C%22category%22%3A%22subspeciality%22%7D%5D&latitude=12.9926968&longitude=77.6803507&location_type=geo%20location&city=Bangalore");

		List<WebElement> doclist = driver
				.findElements(By.xpath("//div[@class='listing-doctor-card']/div/div[2]/a/div/h2"));
		
		

		for (int i = 0; i < doclist.size(); i++) {

			System.out.println(doclist.get(i).getText());

			if ((doclist.get(i).getText()).contains("Dr. Jaswanth Reddy")) {
				
				driver.findElement(By.xpath("(//button[@data-qa-id='book_button'])[i+1]")).click();
				System.out.println(i);

				/*doclist.get(i).click();
				
				Set<String> id=driver.getWindowHandles();
				Iterator <String > it=id.iterator();
				String  Pid=it.next();
				String  Cid=it.next();
				
				
				
			driver.switchTo().window(Cid);
			
			System.out.println(driver.getTitle());
			
			Thread.sleep(2000);
			
				
			driver.findElement(By.xpath("//button[@class='u-t-capitalize u-bold c-btn--dark-medium']")).click();*/
						

				break;

			}

		}

	}
}


