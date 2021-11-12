package programpractice;

public class Reverseint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1234;
		
		int rev=0;
		
	while(a>=1)
	{
		rev=rev*10 + a%10;
		
		a=a/10;
		
		
	}
	System.out.println(rev);
	}

}
