package JavaBasics;

public class StringConcatenation {
	
	public static void main(String[] args) {

	int i= 100;
	int j= 200;
	
	String A= "Hello ";
	String B= "World";
	
	double d1=22.22;
	double d2=11.23;
	
	
	
		
		System.out.println(i+j);
		System.out.println(i+j+A+B);// Output : 300HelloWorld
		
		System.out.println(A+B+i+j); //Output= HelloWorld100200
		System.out.println(A+B+(i+j));
		
		System.out.println(A+B+i+j+A+B+i+j);
		System.out.println(A+i+B+j+A+B+i+j+A);
		System.out.println(d1+d2);
		System.out.println(A+B+d1+d2);
		System.out.println("Helloworld"+A);
		System.out.println("The value of i is :" + " "+ i);//println is use to print in new line.
		System.out.print("Hello selenium"); //print is use to print in same line.
		System.out.println("Hello Testing");
		
	}
}

