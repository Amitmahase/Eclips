package ArraysDemo;

import java.sql.Date;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Madam";
		String reverse="";
	
		
		/*for(int i=a.length()-1;i>=0;i--)
		{
			
			reverse=reverse+ a.charAt(i);
		}
		
		System.out.println("The Reverse string is ="+ reverse);
		
		
	
	if(a.contentEquals(reverse))
	{
		System.out.println("the string is same ");
		
		
		//System.out.println(reverse);
		
	}
	else 
	{
		System.out.println("the string is not same");
	}
	
	*/
	
		/*StringBuffer SB=new StringBuffer(a);
		
		System.out.println(SB.reverse());*/
		
		StringBuilder Sb=new StringBuilder(a);
		System.out.println(Sb.reverse());
		
}}

