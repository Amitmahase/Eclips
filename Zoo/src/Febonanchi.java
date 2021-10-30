
public class Febonanchi {

	public static void main(String[] args) {
		
		
		//febonanchi series:
		
		int first=0;
		int second=1;
		int sum;
		
		System.out.print("the febonanchi series is : --> " + first);
		for(int i=0;i<20;i++)
		{
			
			sum=first+second;
			System.out.print("," + second);
			first=second;
			second=sum;
			
		}
		
	}

}
