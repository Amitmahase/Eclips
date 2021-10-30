package programpractice;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter the first no.");
		int num1=reader.nextInt();
		
		
		if (num1%2==0)
		{
			System.out.println("The number is even-->" + num1);
		}
		else
		{
			System.out.println("The entered no. is odd" +  "   "+  num1);
		}
		

	}

}
