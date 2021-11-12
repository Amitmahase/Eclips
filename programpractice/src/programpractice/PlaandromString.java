package programpractice;

public class PlaandromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="civic";
		s=s.toLowerCase();
		char ltr[]=s.toCharArray();
		String rev="";
		for(int i=ltr.length-1;i>=0;i--)
		{
			
			rev=rev+ltr[i];
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("String is Panaldrom");
		}

	}

}
