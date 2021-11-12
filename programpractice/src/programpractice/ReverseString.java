package programpractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I love india";
		
		/*String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
		
		rev=rev+s.charAt(i);
		} */
		
		
//System.out.println(rev);


		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		

	}

}
