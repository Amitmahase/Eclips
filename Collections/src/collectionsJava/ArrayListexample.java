package collectionsJava;

import java.util.ArrayList;

public class ArrayListexample {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Rahul");
		a.add("Amit");
		
		a.add(0, "java");
		
		//a.remove(1);
		//a.removeAll(a);
		
		System.out.println(a.get(2));
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("Amit"));
		a.size();
		a.add("Amit");
		System.out.println(a);
		
	}

}
