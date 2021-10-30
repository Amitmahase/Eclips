class arent
{
	
	arent()
	{
		
		System.out.println("parent cunstroctor");
	}
}


class hild extends arent
{
	
	hild()
	{
		
		System.out.println("child cunstrocter");
	}
}

public class run
{
	
	public static void main(String[] args)
	{
		System.out.println("I love india");
		
		hild c=new hild();
	}
}
