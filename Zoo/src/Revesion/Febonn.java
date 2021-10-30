package Revesion;

public class Febonn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first=0;
		int second=1;
		System.out.print("The Febonanchi series is -->>" + first);
		
		for(int i=0;i<10;i++)
		{
			
			int sum=first+second;
			
			System.out.print(","+ second);
			first=second;
			second=sum;
			
			
		}

	}

}
