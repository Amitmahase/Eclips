package OopConceptPart1;

public class MethodOverloading  {
	
	public static void main(String[] args)
	{
		
		MethodOverloading obj=new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10,20);
		}
	
	
	 void sum() {
			
			System.out.println("sum method with no arguments");
		
	}
	 
	 void sum(int i)
	 {
		 System.out.println("sum method with 1 parameter");
		
		 
	 }
	 public void sum(int i, int j) {
		 
		 
		 System.out.println("sum methos with 2 arguments");
	 }
	 
	 
	 }



