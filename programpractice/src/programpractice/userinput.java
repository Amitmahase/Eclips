package programpractice;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter the no.");
		
		int num=reader.nextInt();
		
		System.out.println("The entered no. is -->" + "  "+  num);

	}

}
