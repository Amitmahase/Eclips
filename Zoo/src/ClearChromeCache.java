import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ClearChromeCache {

    WebDriver driver;

    /*This will clear cache*/
    @Test
    public void clearCache() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//eikamum//Desktop//chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.get("chrome://settings/clearBrowserData");
        Thread.sleep(5000);
        driver.switchTo().activeElement();
        driver.findElement(By.cssSelector("* /deep/ #clearBrowsingDataConfirm")).click();
        Thread.sleep(5000);
    }

    /*This will launch browser with cache disabled*/
    @SuppressWarnings("deprecation its quite harmfull")
	@Test
    public void launchWithoutCache() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//eikamum//Desktop//chromedriver.exe");
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability("applicationCacheEnabled", false);
        driver = new ChromeDriver(cap);
    }
}