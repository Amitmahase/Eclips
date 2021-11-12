package programpractice;

public class Noininteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=15837593;
		//find the no. of digits in int.
		int count=0;
		while(a !=0)
		{
			
			a=a/10;
			count++;
		}
		System.out.println("The digits ininteger is : "+ count);

	}

}
