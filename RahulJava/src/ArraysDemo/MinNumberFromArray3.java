package ArraysDemo;

public class MinNumberFromArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// find the lowest number in array

		int a[][] = { { 91, 31, 99, 3 }, { 31, 45, 61, 89 }, { 21, 39, 19, 44 } };
		int min = a[0][0];
		int max = a[0][0];
		int mincolumn = 0;
		int l = a.length;
		int leng = l;
		System.out.println("lenght is : "+ l);

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < min)

				{
					min = a[i][j];
					mincolumn = j;
				}

			}

		}

		
		System.out.println("The min no. is : " +min);
		
		
		for(int k=0;k<l;k++)
		{
			if (a[k][mincolumn]>max)
			{
				
				max=a[k][mincolumn];
			}
		}
		
		System.out.println("the max no. in minimum no column is :"+ max);
	
}
}