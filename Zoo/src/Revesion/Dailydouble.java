package Revesion;

public class Dailydouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstDay=1;
		int total=7;
		
		
		for(int i=2;i<=total;i++)
		{
			
			int Daysincrement=firstDay*2;
			
			firstDay=Daysincrement;
			
			System.out.println("incremented days are -->" + ","+ i + "th day"+ " " +  Daysincrement);
		}

	}

}
