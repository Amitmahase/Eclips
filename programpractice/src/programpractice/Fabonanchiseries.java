package programpractice;

public class Fabonanchiseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Febonachi series= 0,1,1,2,3,5,8,13...
		
		int max=15;
		int firstno=0;
		int secondno=1;
		int sum;
		
		System.out.println("The Febonanchi series is : "+ firstno+","+secondno);
		
		for(int i=0;i<max;i++)
		{
			sum=firstno+secondno;
			System.out.print(","+ sum);
			firstno=secondno;
			secondno=sum;
			
		}
		
		

	}

}
