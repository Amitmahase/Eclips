package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.educationLoan();
		hs.transferMoney();
		hs.carLoan();
		
		//dynamic polymorphism
		//Child class object can be reffered by parent interface referece variable.
		
		USBank b =new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		
		System.out.println(USBank.min_bal);
		System.out.println(HSBCBank.min_bal);
		//b.carLoan();-- cant be access coz its a separate fetures of US bank.
		
	
	}

}
