public class Paa
{
	
	String S="Parent variable";
	
}

class C extends Paa
{
	
	String S="Child variable";
	
	public void m()
	{
		
		System.out.println(S);
		System.out.println(this.S);
		System.out.println(super.S);
	}

	
	
public static void main(String[] args)
	{
		
		C c=new C();
		c.m();
		
	}
}
	
