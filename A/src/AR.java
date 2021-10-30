public class AR {
	
	public static void reverse(String[]a, int n)
	{
		int j=n;
		String b[]=new String[n];
		for(int i=0;i<n;i++)
			
		{
			
			b[i]=a[j-1];
			j--;
		}
		
		for(int k=0;k<n;k++)
		{
			
			System.out.println(b[k]);
		}
		
	}
public static void main(String[] args)
{
	
	String []arr= {"aaa","sds","fff","frgr"};
	reverse(arr, arr.length);
}
	
	
}


