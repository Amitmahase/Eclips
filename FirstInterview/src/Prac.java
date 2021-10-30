import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.practo.com/search/doctors?results_type=doctor&q=%5B%7B%22word%22%3A%22Dentist%22%2C%22autocompleted%22%3Atrue%2C%22category%22%3A%22subspeciality%22%7D%5D&city=Bangalore");
		
		List<WebElement> docs=driver.findElements(By.xpath("//div[@class='u-border-general--bottom']/div/div/div[2]/a/div/h2"));
		
		List<WebElement> appointment=driver.findElements(By.xpath("//div[@class='u-border-general--bottom']/div/div[2]/div[2]/div/button"));
		
		int count=docs.size();
		for(int i=0;i<count;i++)
		{
			if((docs.get(i).getText()).contains("Dr. Ganesh Shetty"))
			{
				//docs.get(i).click();
				
				
				if((appointment.get(i).getText()).contains("Book Appointment"))
						{
				appointment.get(i).click();
				break;
						}
			}
			
			
			
			
		}
		

	}

}
