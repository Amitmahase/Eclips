package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@Parameters({"URL","username"})
	@Test
	public void Weblogin(String urlname, String uname)
	{
		System.out.println("Weblogin");
		System.out.println(urlname);
		System.out.println(uname);
	}
	@BeforeMethod
	public void Bfrmthd()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method");
	}
	
	
	/*@Test(dataProvider="getData")
	public void Mobilelogin(String username, String password)
	{
		System.out.println("Moblogin");
		System.out.println("username");
		System.out.println("Password");
	}
	
	@DataProvider
	public Object[][] getDate()
	{
		//1st combination of username n password-good credit history
		//2nd, other combination of username and password, with poora credit history
		//3rd, combination with no credit history
		
		Object[][] data=new Object[3][2]; 
		data[0][0]="First username";
		data[0][1]="First password";
		
		//2nd set of data
		data[1][0]="second username";
		data[1][1]="second password";
		
		//3rd set of data
		data[2][0]="Third username";
		data[2][1]="Thired password";
		
		return data;
		}*/
		

	
	@Test
	public void Mobilelogout()
	{
		System.out.println("Moblogout");
		Assert.assertTrue(false);
	}
	
	@Test(groups= {"smoke"})
	public void Mobilelog()
	{
		System.out.println("Moblog");
	}
	
	
	@Test
	public void APIlogin()
	{
		System.out.println("Apilogin");
	}

}
