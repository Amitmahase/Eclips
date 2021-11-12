package programpractice;

public class Largestof3no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=90;
		int b=20;
		int c=1000;
		
		/*if (a>b && a>c)
		{
			System.out.println(a +"is large");
		}
		else if(b>a && b>c)
		{
			System.out.println(b + "is large");
		}
		else
		{
			System.out.println("c is large");
		}*/
		
		
		//2nd way
		int large = a>b?a:b;
		int largest =large>c?large:c;
		
		System.out.println(largest);

	}

}
