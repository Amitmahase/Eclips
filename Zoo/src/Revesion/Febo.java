package Revesion;

public class Febo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WAP to get febonanchi series
		
		int first=0;
		int second=1;
		int sum;
		System.out.print("The Febonanchi series is " + first+ ","+second);
		int max=20;
		for(int i=0;i<max;i++)
		{
			
			
			sum=first+second;
			
			System.out.print(", " + sum);
			first=second;
			second=sum;
			
		}
		
	}

}
