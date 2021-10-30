package OopConceptPart1;

public class LocalvsGlobalvariable {
	
	int age=25;  // Global variable, class variable.
	String name="John";
	
	public static void main (String[] args)
	
	{
	
		LocalvsGlobalvariable obj=new LocalvsGlobalvariable();
		int i=10; // local variable for main method
		System.out.println(i);
		obj.sum();
		System.out.println(obj.name);
		
	}
	
	public void sum()
	
	{
		int i=15; //local variable for sum method
		int j=20;
		int sum = i+j;
		int age =25;
		
		
		System.out.println(sum);
	}
	
	
	}

