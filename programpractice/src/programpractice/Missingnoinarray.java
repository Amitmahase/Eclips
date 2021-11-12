package programpractice;

import java.util.Arrays;

public class Missingnoinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,7};
		int sum=0;
		int sum1=0;
		
		Arrays.sort(arr);
		
		for(int no:arr)
		{
			sum=sum+no;
		}
		
		System.out.println(sum);
		
		int l=arr[arr.length-1];
		for(int i=1;i<=l;i++)
		{
			sum1=sum1+i;
			
		}
		
		System.out.println(sum1);
		
		System.out.println("missing no is : --> "+ " "+ (sum1-sum));
		
		
	}

}
