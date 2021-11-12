package programpractice;

import java.util.Random;

public class Randomint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand=new Random();
		
		System.out.println(rand.nextInt(1000));
		//it will return from 0 to 1000 any no.
		//to print random double
		System.out.println(rand.nextDouble()); //range 0.0 to 1.0 default
		
		

	}

}
