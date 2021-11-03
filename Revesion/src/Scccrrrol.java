import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Scccrrrol {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		// System.out.println(driver.findElement(By.xpath("//a[text()='SoapUI']")).getAttribute("href"));

		WebElement footer = driver.findElement(By.id("gf-BIG"));

		List<WebElement> links = footer.findElements(By.tagName("a"));

		System.out.println(links.size());
		for (WebElement l : links) {
			String url = l.getAttribute("href");

			HttpsURLConnection conn = (HttpsURLConnection) new URL(url).openConnection();

			conn.setRequestMethod("HEAD");
			conn.connect();
			int codes = conn.getResponseCode();
			System.out.println(codes);
			if (codes > 400) {

				Assert.assertTrue(false);
				System.out.println("The link with text is broken" + l.getText() + " " + "with code :" + codes);
			}

		}

	}
}
