package JavaBasics;

abstract class Vehicle 
{
	abstract void start();
	
	
}
	class Car extends Vehicle
	{
		void start()
		{
			System.out.println("Starts with key");
		}
	}
	class Scooter extends Vehicle
	{
		void start()
		{
			System.out.println("Starts with kick");
		}
	
	public static void main(String[] args)
	{
		Car c= new Car();
		Scooter S=new Scooter();
		c.start();
		S.start();
	}
	}