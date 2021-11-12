package OOPS;

public class djjds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Animation";
		String rev="";
		
		//StringBuffer sb=new StringBuffer(s);
		
		//sb.reverse();
		
		//System.out.println(sb.reverse());
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}

		System.out.println(rev);
	}

}
