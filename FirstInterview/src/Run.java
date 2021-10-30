class Parent
{
	
	String s="parent";
	
	Parent()
	{
		
		System.out.println("Parent cunstroctr");
	}
	
}

class Child extends Parent
{
	String s="Child";
	
	Child()
	{
		System.out.println("Constructor of Child");
		System.out.println(s);
		System.out.println(super.s);
		System.out.println(this.s);
	}
	
}



public class Run {
	

	public static void main(String[] args) {
		Child c=new Child();
		
		

	}

}
