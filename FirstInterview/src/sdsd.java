
public class sdsd {
	
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,13};
		
		int l=a.length;
		int sum=0;
		int max=a[0];
		int rsum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
			if(max<a[i])
			{
				max=a[i];
			}
			
		}
		
		
		for(int j=max;j>0;j--)
		{
			
			rsum=rsum+j;
		
		
		}
		
		System.out.println("so the missing no. is-->" +" "+ (rsum-sum));
		
	}
	

	
	
	

}
