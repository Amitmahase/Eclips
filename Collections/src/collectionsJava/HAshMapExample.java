package collectionsJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HAshMapExample {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(0, "Hello");
		hm.put(1, "Good bye");
		hm.put(2, "Morning");
		hm.put(3, "evening");
		System.out.println(hm.get(3));
		//hm.remove(2);
		Set<Entry<Integer, String>> s=hm.entrySet();
		Iterator<Entry<Integer, String>> it= s.iterator();
		
		while(it.hasNext())
		{
			
			//System.out.println(it.next());
			Map.Entry mp=(Map.Entry)it.next();
			
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
		
		

	}

}
