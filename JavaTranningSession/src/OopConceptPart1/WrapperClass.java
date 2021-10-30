package OopConceptPart1;

public class WrapperClass {

	public static void main(String[] args) {
		
		String x= "100";
		System.out.println(x+20);
		
		
		//Data conversion: String to int
		int i= Integer.parseInt(x);
		
		System.out.println(i+20);
		
		//Integer, double, charector , Boolean
		
		//String to double conversion
		String y ="12.33";
		
		double d= Double.parseDouble(y);
		System.out.println(d);
		
		//Double to int conversion
		
		//double d1=12.55;
		//int z= Integer.parseInt(d1);
			
		
		//String to boolean;
		
		String m="false";
		 boolean B1=Boolean.parseBoolean(m);
		System.out.println(B1);
		
		//int to string conversion;
		
		int l=10;
		String S1=String.valueOf(l);
		System.out.println(l);
		System.out.println(S1+20);
		
		//Important Question: here we will get number. format exception.
		String A= "100A";
		int ii =Integer.parseInt(A);
	}

}
