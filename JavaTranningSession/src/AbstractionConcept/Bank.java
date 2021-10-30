package AbstractionConcept;

public abstract class Bank {
	
	public abstract void loan(); //abstract method- no method body
	
	public void credit()
	{
		System.out.println("Credit method");
	}
	
	public void debit()
	{
		System.out.println("Debit method");
	}

}
