package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@AfterTest
	
	public void MobileCarLoan() {
		System.out.println("Webloginlast will execute");
	}

	
	@BeforeSuite
	public void bfrsuite() {
		System.out.println("to set global variable");
	}

	@AfterSuite(groups= {"smoke"})
	
	public void aftersuite() {
		System.out.println("I m no. 1");
	}

	@Parameters({"URL"})
	@Test
	public void MobCarLoan(String urlname) {
		System.out.println("Moblogin");
		System.out.println(urlname);
	}

	
	@BeforeTest
	public void PIlogin() {
		System.out.println("Apilogin");
	}

}
