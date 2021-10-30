package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank  {//we are achiving multiple inheritance 
	
	//IS - A relation
	
	//If a class is implementing any interface, then its mandatory to define/override all the methods of interface.
	//overriding from USBank
	public void credit()
	{
		System.out.println("HSBC credit");
	}

	public void debit()
	{
		
		System.out.println("HSBC debit");
		
	}
	
	public void transferMoney()
	{
		System.out.println("Transfer money");
	}
	
	//Separate methos of HSBCBank
	public void educationLoan()
	{
		System.out.println("Education loan");
		
	}
	public void carLoan()
	{
		System.out.println("car loan");
		
	}
	
	//Brazil bank method: overriding from BrazilBank.
	public void mutualFund()
	{
		System.out.println("Mutual funds");
	}
}

	
