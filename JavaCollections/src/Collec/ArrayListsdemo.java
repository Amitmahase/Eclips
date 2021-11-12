package Collec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList al=new ArrayList();
		al.add(3);
		al.add(4);
		al.add(6);
		al.add(793);
		al.size();
		//al.remove(2);
		//al.remove("asdf");
		//al.removeAll(al);
		
		
		al.add(0,11);
		
		
		Iterator it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		 ArrayList all=new ArrayList();
		 
		all.addAll(al);
		System.out.println(all);
		//all.removeAll(al);
		System.out.println(all);
		
		Collections.sort(all);
		System.out.println(all);
		
		
	}

}
