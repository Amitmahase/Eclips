package ArraysDemo;



public class MinNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find the lowest number in array
		
		int a[]= {11,23,9,24,31};
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
		
			if(a[i]<min)
			{
				min=a[i];
			}
			
			
			
}
		
		System.out.println(min);
	}
	
	}
	

