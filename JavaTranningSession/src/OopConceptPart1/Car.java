package OopConceptPart1;

public class Car {
	
	//Class variables
	int mod;
	int wheel;
	public static void main(String[] args)
	
	{
		
		//new Car();--- this is the object of Car class
		//new keyword is use to create the Object
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		
		
	a.mod= 2015;
	a.wheel=4;
	b.mod=2014;
	b.wheel=4;
	c.mod=2013;
	c.wheel=4;
	System.out.println("before shifting the references");
	
	System.out.println(a.mod);
	System.out.println(a.wheel);
	System.out.println(b.mod +" , " + b.wheel);

	System.out.println("before shifting the references");
	
	a=b;
	b=c;
	c=a;
	System.out.println(a.mod);
	System.out.println(b.mod);
	System.out.println(c.mod);
	}

}
