package Palandrom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class Peland {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Properties prop=new Properties();
		
		FileInputStream fis =new FileInputStream("C:\\Users\\eikamum\\eclipse-workspace\\Zoo\\src\\Palandrom\\utilities.properties");
		
		prop.load(fis);
		String rev="";
		
		String s=prop.getProperty("word");
		
		for(int i=s.length()-1;i>=0;i--)
			
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if (rev.equalsIgnoreCase(s))
		{
		
			
			System.out.println("yes the no. is pelendrom");
		}
		else
		{
			
			System.out.println("Word is not pelendrom");
		}
		
		
		

	}

}
