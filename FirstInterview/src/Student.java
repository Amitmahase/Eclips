
public class Student {
	
	//costructor
	
	String name;
	int Rollno; 
	
	Student(String name, int Rollno)
	{
		this.name=name;
		this.Rollno=Rollno;
		
	}
	
	public static void main(String[] args) {
		Student s=new Student("anil", 101);
		

		
		System.out.println(s.name);
		System.out.println(s.Rollno);
	}

}
