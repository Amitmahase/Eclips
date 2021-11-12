package programpractice;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"I","love","java","love","java"};
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j])
				{
					System.out.println("The duplicate words are--->" + arr[i]);
				}
			}
		}

	}

}
