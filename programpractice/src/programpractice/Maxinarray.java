package programpractice;

public class Maxinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 34, 5, 76, 7, 8, 5, 45, 3 };

		int max = arr[0];
		int max2 = arr[0];
		int max3 = arr[0];
		for (int no : arr) {

			if (max < no) {
				max = no;

			}
		}
		System.out.println("The  max no in array is --> " + max);
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>max2 && arr[i]<max )
			{
				max2=arr[i];
			}
		}
		
		System.out.println("max2=  "+max2);
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>max3 && arr[i]<max2 )
			{
				max3=arr[i];
			}
		}

		System.out.println("max3=   "+ max3);
	}

}
