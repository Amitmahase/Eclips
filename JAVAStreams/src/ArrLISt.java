import java.util.ArrayList;

public class ArrLISt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names=new  ArrayList<String>();
		names.add("Amit");
		names.add("Sunil");
		names.add("Abhijeet");
		names.add("Ankit");
		names.add("deepak");
		names.add("Ankita");
		int count=0;
		
		long a=names.stream().filter(s->s.startsWith("A")).count();
		

	}

}
