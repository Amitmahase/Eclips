package programpractice;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="   i love programming and I am a automation test engineer   ";
		
		/*s=s.trim();
		s=s.replaceAll(" ", "");
		System.out.println(s);*/
		
		
		//How to count words in a string
		
		s=s.trim();
		
int count=0;
for(int i=0;i<s.length();i++)
{

	
	if (s.charAt(i)==' ')
	{
		count++;
	}
}

System.out.println("the no of words in the string is --> "+ (count+1));
		
	}

}
