package JavaBasics;

public class TwoDimeArray {
	
	public static void main(String[] args) 
	{
		
		String x[][]=new String[3][5];
		System.out.println(x.length);// 3- total no. of rows.
		System.out.println(x[1].length);//5- total no of column
		
		//1st row of 3X5 matrix.
		
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		//2nd row of 3X5 matrix.
		x[1][0]="F";
		x[1][1]="G";
		x[1][2]="H";
		x[1][3]="I";
		x[1][4]="J";
		//3rd row of 3X5 matrix.
		x[2][0]="K";
		x[2][1]="L";
		x[2][2]="M";
		x[2][3]="N";
		x[2][4]="O";
		
		for (int i=0;i<x.length;i++)
		{
			
			for(int j=0;j<x[0].length;j++)
			{
			
				System.out.println(x[i][j]); 
			}
			
		}
		
		}
		
		
		
		
		
	}

