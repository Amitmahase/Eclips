package OOPConceptPart2;

public class BMW extends Car{ //has-a relationship
	
	/*When same method is present in parent as well as in child class, with same name and 
	same number of arguments , is called method overriding;*/
	
	public void start()
	{
		
		System.out.println("BMW Starts");
	}
	
	public void theftsafty()  
	{
		
		System.out.println("BMW having theft safty fetures");
	}

}
