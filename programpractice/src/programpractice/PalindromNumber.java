package programpractice;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=16461;
		int no=a;
		int rev=0;
		
		while(a !=0)
		{
			rev=rev*10+a%10;
			a=a/10;
			
			
		}
		System.out.println(rev);
		
		if(rev==no)
		{
			System.out.println("the no is palendrom");
		}

	}

}
