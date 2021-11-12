package ArraysDemo;

public class MaxinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,11,4,6,7,5,4,6,8,9};
		int max=arr[0];
		int max2=arr[0];
		int max3=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(max<arr[i])
			{
				max=arr[i];
				
			}
		}
		
		System.out.println(max);
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(max2<arr[i] && arr[i]<max)
			{
				max2=arr[i];
				
			}
		}
		
		System.out.println(max2);
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(max3<arr[i] && arr[i]<max2)
			{
				max3=arr[i];
				
			}
		}
		
		System.out.println(max3);
		

	}

}
