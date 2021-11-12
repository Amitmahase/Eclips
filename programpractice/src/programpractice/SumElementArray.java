package programpractice;

import java.util.Arrays;

public class SumElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {1,2,6,7,8,2,5,7};
		int sum=0;
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-1]);
		for(int no:arr)
		{
			sum=sum+no;
			
		}

		System.out.println("the sum of elements of this array is : "+ sum);
	}

}
