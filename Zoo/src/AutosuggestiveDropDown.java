import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://ksrtc.in/oprs-web/");

		driver.findElement(By.id("fromPlaceName")).sendKeys("Beng");
		Thread.sleep(2000);

		/*
		 * while(true) {
		 * driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		 * //String desti= driver.findElement(By.id("fromPlaceName")).getText();
		 * 
		 * 
		 * 
		 * //Javascript DOM extract hidden element //because selenium cannpt identify
		 * hidden elements //investigate the properties of object if it have any hidden
		 * text.
		 * 
		 * JavascriptExecutor js=(JavascriptExecutor)driver; String
		 * script="return document.getElementById(\"fromPlaceName\").value;";
		 * 
		 * String text=(String) js.executeScript(script); System.out.println(text);
		 * 
		 * 
		 * if(text.contentEquals("BENGALURU INTERNATION AIRPORT")) {
		 * 
		 * driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER); break; }
		 * else { System.out.println("Continue looping"); } }
		 */

		// driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";

		String text = (String) js.executeScript(script);
		// System.out.println(text);
		int i = 0;
		while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			text = (String) js.executeScript(script);
			if (i > 10) {
				break;
			}
		}
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);

			if (i > 10) {
				System.out.println("no such element found");
				
			} else {
				System.out.println("item found");
			}
	}
}
			
			



