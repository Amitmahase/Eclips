package programpractice;

import java.util.Arrays;

public class Reverseeachwordinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am software engineer";
		String revstring="";
		
		String arr[]=s.split(" ");
		for(String word:arr)
		{
			String revword="";
			for(int i=word.length()-1;i>=0;i--)
			{
				revword=revword+word.charAt(i);
				
			}
			revstring=revstring+revword+ " ";
			
		}
		
		System.out.println(revstring);
		
	}

}
