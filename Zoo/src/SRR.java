
public class SRR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Reversal of the string
		
		String a="Animation";
		String reverse="";
		int l=a.length();
		int i=l;
		for(i=l-1;i>=0;i--)
		{
			reverse=reverse+a.charAt(i);
			
		}
		
		System.out.println(reverse);
		
	}
	
}

