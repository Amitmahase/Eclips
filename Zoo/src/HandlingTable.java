import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {

	public static void main(String[] args) {

		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/32058/eng-vs-ind-4th-test-india-tour-of-england-2021");

		WebElement table = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();

		// System.out.println(count);

		for (int i = 0; i < rowcount - 2; i++) {
			String s = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			System.out.println(s);
			int valueinteger = Integer.parseInt(s);
			sum = sum + valueinteger;

		}

		String s1 = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		System.out.println(s1);
		String s2 = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		System.out.println(s2);
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		sum = sum + a ;
		System.out.println("Total is equals to : "+ sum);
		
		if(sum==b)
		{
			System.out.println("Values are correct");
		}
	
		
		else
		{
			System.out.println("values are  not correct");
		}

	}

}
