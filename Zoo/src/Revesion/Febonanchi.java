package Revesion;



public class Febonanchi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first=0;
		int second=1;
		
		int sum=first+second;
		int max=31;
		System.out.println("The febonachi series is -->" + first + ", "+second);
		
		for(int i=0;i<max;i++)
		{
			sum=first+second;
		System.out.print(","+ sum);
			first=second;
			second=sum;
			
			
		}
		

	}

}
