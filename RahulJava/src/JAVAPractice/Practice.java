package JAVAPractice;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program to reverse a string

		// String a="I am RICH";
		// String reverse="";
		/*
		 * for (int i=a.length()-1;i>=0;i--) {
		 * 
		 * reverse=reverse+a.charAt(i); }
		 * 
		 * System.out.println(reverse);
		 * 
		 * 
		 * StringBuffer SB=new StringBuffer(a); System.out.println(SB.reverse());
		 */

		// Reverse of an array

		/*
		 * int a[]= {123,234,445}; int l=a.length; int rev[]=new int[l]; int c=l;
		 * 
		 * for(int i=0;i<a.length;i++) { rev[c-1]=a[i]; c--;
		 * 
		 * }
		 * 
		 * for(int k=0;k<l;k++) { System.out.println(rev[k]); }
		 */

		// Max no in an array

		int a[][] = { { 121, 111, 99, 89, 132, 9999 }, { 121, 333, 444, 56, 6666, 5665 },
				{ 12, 33, 44, 563, 666, 6 } };
		int min = a[0][0];
		int mincolumn = 0;
		int l = a.length;
		int m=l;
		System.out.println(l);
		int max = a[0][0];
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] < min) {
					min = a[i][j];
					mincolumn = j;
				}

			}
			for(int k=0;k<m-1;k++)
			{
				
			
		if(a[k][mincolumn] > max)

			{
				max = a[k][mincolumn];
			}
		}
		
		

		

	}
		
		System.out.println("the min no. in array is =" + min);
		System.out.println("the max no in min column is  =" + max);
}
}

