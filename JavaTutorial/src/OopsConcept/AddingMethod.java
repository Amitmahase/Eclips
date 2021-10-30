package OopsConcept;

public class AddingMethod {

	
	public static void main(String[] args) {

		String studentname;
		String grade;
		
		studentname= "Johny";
		grade= findGrades(99);
		displayGrades(studentname, grade);
		grade=findGrades(80);
		studentname="john";
		displayGrades(studentname, grade);
		findGrades(70);
		
		

	}
	
	public static String findGrades( int score)
	{
	String grade;
		
		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 80 && score < 90) {
			grade = "B";
		} else if (score >= 70 && score < 80)

		{
			grade = "C";

		} else {
			grade = "D";
		}
		return grade;
		
	}

	
	public static void displayGrades(String studentname, String grade)
	
	{
		System.out.println("************************");
		
		System.out.println("grade of : "+ studentname +" is "+ grade);
		System.out.println("************************");
	}
	{
		
		
	}
}
