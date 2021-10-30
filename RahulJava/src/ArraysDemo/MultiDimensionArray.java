package ArraysDemo;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][]=new int [2][3];
		a[0][0]=7;
		a[0][1]=3;
		a[0][2]=8;
		a[1][0]=9;
		a[1][1]=5;
		a[1][2]=6;
		//a[2][0]=4;
		//a[2][1]=2;
		//a[2][2]=1;
		
		//or
		
		int b[][]= {{7,3,8},{9,5,6},{4,2,1}};
		
		
		
		for(int i=0;i<b.length;i++)
		{
			//System.out.println(a[i].length);
	
			for(int j=0;j<b[i].length;j++)
			{
				System.out.println(b[i][j]);
			}
	
		
	}
	}
}
