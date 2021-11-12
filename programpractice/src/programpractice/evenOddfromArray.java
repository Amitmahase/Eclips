package programpractice;

import java.util.Arrays;

public class evenOddfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,46,6,3,35,7,88,23};
		Arrays.sort(arr);
		
		for(int no:arr)
		{
			
			if(no%2==0)
			{
				System.out.println("the no is even" + "  "+no);
			}
			else
			{
				System.out.println("the no is odd" + "  "+no);
			}
		}

	}

}
