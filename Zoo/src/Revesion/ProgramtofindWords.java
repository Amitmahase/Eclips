package Revesion;

public class ProgramtofindWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Amit is a software engineer, and working as a automation engineer in Google";
		
		int l=s.length();
		
		int words=1;
		for(int i=0;i<l;i++)
		{
			char c=s.charAt(i);
			
			
			if(c==' ')
			{
				 words=words+1;
				
			}
			
		}
		
		System.out.println("Total no. of words in sentence is --> "+ words);

	}

}
