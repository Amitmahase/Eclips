
public class FebonanchiSeries {

	public static void main(String[] args) {
		
		int first=0;
		int second=1;
		int sum;
		
		int max=3;
		
		System.out.print("The Febonanchi series is :--> "+ first);
		for(int i=0;i<max;i++)
		{
			sum=first+second;
			System.out.print("," + second);
			
			first=second;
			second=sum;
		}

	}

}
