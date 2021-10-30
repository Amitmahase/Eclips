import java.security.DomainCombiner;

public class ArrayReverse2 {

	
	
	public static void reverse(String[]a, int n)
	{
		int j=n;
		String rev[]=new String [n];
		
		
		for(int i=0;i<n;i++)
		{
			
			rev[j-1]=a[i];
			
			j--;
		}
		
		for(int k=0;k<n;k++)
		{
			
			System.out.println(rev[k]);
		}
	}
		
		public static void main(String[] args) {
			
			String arr[]= {"aaa","sss","ddd","ffff","dffdfd","232","34354"};
			
			reverse(arr,arr.length);
			
		}
		
}


