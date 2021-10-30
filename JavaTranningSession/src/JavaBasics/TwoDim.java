package JavaBasics;

public class TwoDim {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		int x[][]=new int[4][4];
		x[0][0]=1;
		x[0][1]=2;
		x[0][2]=3;
		x[0][3]=4;
		
		x[1][0]=5;
		x[1][1]=6;
		x[1][2]=7;
		x[1][3]=8;
		
		x[2][0]=9;
		x[2][1]=10;
		x[2][2]=11;
		x[2][3]=12;
		
		x[3][0]=13;
		x[3][1]=14;
		x[3][2]=15;
		x[3][3]=16;
		
		for(int i=0;i<x.length;i++) 
		{
		for(int j=0;j<x[0].length;j++) {
			
			System.out.println(x[i][j]);
		}
			
		}
		

	}

}
