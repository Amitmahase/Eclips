package InterfaceConcept;



public class Developing implements BankingClint,DomainClint {
	
	
	public static void main(String[] args)
	{
		Developing d=new Developing();
		d.checkBalance();
		d.tarnsferBalance();
		d.paycreditcard();
		d.receivebalance();
		d.funda();
		d.fundMAnagement();
		
		
		BankingClint dr=new Developing();
		dr.checkBalance();
		DomainClint ds=new Developing();
		ds.funda();
	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		System.out.println("Pay credit card bill");
	}

	@Override
	public void tarnsferBalance() {
		// TODO Auto-generated method stub
		System.out.println("Transfer balance");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
		System.out.println("Check balance");
		
	}
	
	public void receivebalance()
	{
		System.out.println("received balance successfully");
	}

	@Override
	public void fundMAnagement() {
		// TODO Auto-generated method stub
		System.out.println("fund management");
	}

	@Override
	public void funda() {
		// TODO Auto-generated method stub
		System.out.println("funda");
	}

}
