package programpractice;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=4;
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("The given no. a is prime" + a);
		}
		else
		{
			System.out.println("The no. is not prime");
		}

	}

}
