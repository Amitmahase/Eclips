package OOPS;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printDuplicateChars("werwrawegef");
		printDuplicateChars("");
		printDuplicateChars(null);

	}



public static void printDuplicateChars(String str)

{
	
	if (str==null)
	{
		
		System.out.println("Null String");
	return;
	}
	
	if (str.length()==1)
	{
		
		System.out.println("only 1 char is there");
		return;
	}
	
	if(str.isEmpty())
	{
		
		System.out.println("Empty string");
		return;
	}
	
	
	char[] words=str.toCharArray();
	
	Map<Character, Integer> charMap=new HashMap<Character, Integer>();
	
	for(Character ch:words)
	{
		if(charMap.containsKey(ch))
		{
			charMap.put(ch, charMap.get(ch)+1);
			
		}
		
		else {
			charMap.put(ch, 1);
		}
		
	}
	
	Set<Map.Entry<Character, Integer>> entryset=charMap.entrySet();
	
	for(Map.Entry<Character, Integer>entry:entryset)
	{
		
		if(entry.getValue()>1)
		{
			
			System.out.println(entry.getKey()+ " : "+ entry.getValue());
		}
	}
	
}
}
	
