package OopConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj=new FunctionsInJava();
		
		obj.test();
		int l= obj.pqr();
		
		System.out.println(l);
		String k=obj.qa();
		System.out.println(k);
		
		int m=obj.divis(30,10);
		System.out.println(m);
		
		
	}
	
		//non static method
	//void does not return any value
		public void test() {   // no input, no output.
			
			System.out.println("test method");
		}
		
		public int pqr()   //no input some output
		{
			//return type is int.
			System.out.println("PQR method");
			int p= 10;
			int q=20;
			int r=p+q;
			return r;
			
		}
		
		public String qa()  //no input some output.
		
		{
		System.out.println("qa method");
		
		String s = "Selenium";
		return s;
		}
		
		
		
		//Return type - int
		//x, y -- input parameters/arguments
		public int divis(int x, int y) {  //some input , some output
			
			
			System.out.println("division method");
			int d= x/y;
			return d;
			
		}
}		
		

	


	