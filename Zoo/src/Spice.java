import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://beta.spicejet.com/");

		/*
		 * Select s=new Select(driver.findElement(By.id(
		 * "ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"
		 * ))); Thread.sleep(2000);
		 * 
		 * s.selectByVisibleText("USD");
		 */

		/*
		 * driver.findElement(By.xpath("//*[@class='select-box passen_ger']")).click();
		 * 
		 * for(int i=1;i<3;i++) {
		 * driver.findElement(By.className("plus_adult")).click();
		 * 
		 * driver.findElement(By.className("plus_child")).click();
		 * 
		 * 
		 * } /*driver.findElement(By.id("roundTripbdFromView")).sendKeys("BLR");
		 * driver.findElement(By.id("roundTripbdToInput")).sendKeys("MAA");
		 */

		driver.findElement(By.xpath("//input[@autocapitalize='sentences']")).sendKeys("BLR");
		driver.findElement(By.xpath("//a[@value='MAA'] [2]")).click();
	}

}
