package OopsConcept;

public class Car {
	
	//color
	private String color;
	//make
	private String make;
	//model
	private String model;
	//year
	private int year;
	
	
	public void increaseSpeed()
	{
		
		System.out.println("increasing the speed");
	}

	public static void main(String[] args) {
		
		Car c=new Car();
		c.increaseSpeed();
		
		
	 
	}
}
