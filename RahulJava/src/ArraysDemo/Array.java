package ArraysDemo;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array=  A container which stores multiple values of same data type.
		
		int a[]=new int[5]; // Declares an array and allocates memory for the values.
		
		a[0]=1;
		a[1]=2;
		a[2]=8;
		a[3]=11;
		a[4]=23;
		
		int b[]= {32,44,6,66};
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for (int i=0;i<b.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
