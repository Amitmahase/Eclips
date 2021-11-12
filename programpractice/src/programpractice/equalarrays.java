package programpractice;

import java.util.Arrays;

public class equalarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {1,2,3,4};
		int arr1[]= {1,2,3,4};
		/*Arrays.sort(arr);
		Arrays.sort(arr1);
		
		System.out.println(Arrays.equals(arr, arr1));*/
		
		//2nd methos
		
		int l1=arr.length;
		int l2=arr1.length;
		if(l1==l2)
		{
			
			Arrays.sort(arr);
			Arrays.sort(arr1);
			
			if(Arrays.equals(arr, arr1))
			{
				System.out.println("ararys are equal");
			}
		}
		
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		
	}

}
