package OOPConceptPart2;

public class TestCar {

	
	
	
	
	public static void main(String[] args) {
		
		//Static polymorphism/ Compile time polymorphism
		BMW B1=new BMW();
		B1.start();
		B1.stop();
		B1.refule();
		B1.theftsafty();
		B1.engine();
 
		System.out.println("***********");
		Car C=new Car();
				
			C.start();
			C.stop();	
			
			
			//top casting
			Car C1= new BMW();  //Child class  object can be reffered by parent class reference variable 
			//-- called run time polymorphism--> Run time polymorphism.
			
			C1.start();
			C1.stop();
			C1.refule();
			C1.engine();
			
			//Down Casting , not allowed
			
			System.out.println("***********");
			
			//BMW B2 =(BMW)new Car();  // Error:  Class cast exception
		
			
	}

}
