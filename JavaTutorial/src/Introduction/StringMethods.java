package Introduction;

public class StringMethods {

	public static void main(String[] args) {
		
		String str1= "This is the test string";
		String str2="     String with extra spaces       ";
		String str3="Hello";
		
		//String length()= length of the string
		
		System.out.println(str1.length());
		
		//String charAt()- returns a char value at the given index number
		
		System.out.println(str1.charAt(2));
		
		//String concat()- combines specified string at the end of this string
		System.out.println(str1.concat(" This is the appended string"));
		
		//String contains()=  return true if chars are found in the string
		
		System.out.println(str1.contains("is"));
		
		//String startsWith()= to check if starts with given prefix.
		
		System.out.println(str1.startsWith("This"));
		System.out.println(str1.startsWith("what"));

		
		//String endsWith()= to check if ends with given prefix.
		
		System.out.println(str1.endsWith("string"));
		System.out.println(str1.endsWith("what"));
		
		//String equals()= compares the content of two given String
		System.out.println(str1.equals("This is the test string"));
		
		//String indexof()= return index of given character value or substring
		System.out.println(str1.indexOf('i'));// if char is avaiable will return index, else -1
		System.out.println(str1.indexOf('r'));
		
		String s="";
		//String isEmpty()= checks if string is empty
		System.out.println(str1.isEmpty());
		System.out.println(s.isBlank());
		
		//String trim()= eliminates leading and trailing spaces
		System.out.println(str2.trim());
		
		//String replace()= returns a string replacing all the old chat to new char
		System.out.println(str3.replace('l', 'o'));
		
		
		//String substring()
		
	System.out.println("Substring Example 1: "+ str1.substring(5));
	System.out.println("Substring Example 2: "+ str1.substring(4, 15));
	System.out.println("Substring Example 3: " + str1.subSequence(1, 16));
	
	
	//String tocharArray()= converts string in to character array.
	char[] charArray=str1.toCharArray();
	for(int i=0;i<charArray.length;i++)
	{
		System.out.println("Index"+i+ "is :" +charArray[i]);
		
	}
	
	//String tolower()- to convert all char in lower case.
	System.out.println(str1.toLowerCase());
	System.out.println(str1.toUpperCase());
	
	
	}

}
