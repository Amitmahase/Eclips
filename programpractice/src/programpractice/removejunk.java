package programpractice;

public class removejunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="24242wteyeya435#%#^";
		s=s.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(s);

	}

}
 