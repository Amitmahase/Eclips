package collectionsJava;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();

		hs.add("Amit");
		hs.add("animation");
		// hs.remove("animation");
		hs.add("USA");
		hs.add("he");
		hs.add("She");

		hs.add("USA");
		hs.size();
		System.out.println(hs);
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
		

	}

}
