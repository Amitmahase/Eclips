package OopConceptPart1;

public class StaticAndNonStatic {
	
	
	//global variables: the scope of global variable will be available across all the functions with some conditions
	
	String name= "Tom"; //non static global variable
	static int age=25; //static global variable
	
	public static void main(String[] args)
{
		//How to call static method and variable
		//1..direct  calling  
		
		
		sum(); //static class we can call directly
		
		//2..calling by class name
		StaticAndNonStatic.sum();  // 2nd method to call static method.
		
		StaticAndNonStatic obj=new StaticAndNonStatic();
		obj.sendMail();
		obj.sum();
}
	
	//can i access static method by using objest references?
	 //yes
	
	public  void sendMail() { // non static method
		
		
		System.out.println("Sena mail method");
		
	} 
	
	public static void sum() //Static method
	
	{
		System.out.println("Sum method");
	}
	
	}


