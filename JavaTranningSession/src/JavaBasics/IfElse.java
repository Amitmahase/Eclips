package JavaBasics;

public class IfElse {
	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		if(i>j) {
			
			System.out.println("i is greater than j");
		}
		else {
			System.out.println("j is less than i");
		}
		
		//Comparison operator: < , > , <=, >=, ==, !=
		
		int c= 40;
		int d=50;
		
		if (c==d) {
			System.out.println("Print c and d is equal");
		}
		else
		{
			
			System.out.println("both are not equal");
		}
		
		//find the greatest number?
		
		/*int d1=100;
		int d2=300;
		int d3=200;
		int d4=500;
		
		if(d1>d2 & d1>d3 ) 
		{
			System.out.println("d1 is greatest:"+ d1);
		}
		else if (d2>d3)
		{
			System.out.println("d2 is greatest: "+ d2);
		}
		else {
			System.out.println("d3 is the gretest no.:" + d3);
		}*/
		
		
		int d1=100;
		int d2=300;
		int d3=200;
		int d4=500;
		
		if(d1>d2 & d1>d3 & d1>d4 ) 
		{
			System.out.println("d1 is greatest:"+ d1);
		}
		else if (d2>d3 & d2>d4)
		{
			System.out.println("d2 is greatest: "+ d2);
		}
		
		else if (d3>d4)
		{
			System.out.println("d3 is greatest: "+ d2);
		}
		else {
			System.out.println("d4 is the gretest no.:" + d4);
		}
	}

}
