
public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="animation";
		
		char arr[]=s.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j])
				{
					
					System.out.println("the duplicate chars are : " + arr[i]);
				}
			}
		}

	}

}
