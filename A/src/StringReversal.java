
public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "I am very Rich And Happy Man";
		int l = a.length();
		/*String b = "";
		for (int i = l - 1; i >= 0; i--) {
			b = b + a.charAt(i);

		}

		System.out.println(b);*/
		
		//2nd method by String buffer class
		
		/*StringBuffer sb=new StringBuffer(a);
		System.out.println(sb.reverse());*/
		
		//3rd Method
		char[] ch=a.toCharArray();
		String b="";
		//System.out.println(ch);
		for(int j=l-1;j>=0;j--)
		{
			b=b+ch[j];
			
		}
		System.out.println(b);
	}

}
