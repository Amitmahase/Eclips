
public class DuplicateCharacters {

	

		public static void main(String[] args){


		String s="Aniamation rule";
		
		String[] sd=s.split(" ");
		
		for(int i=0;i<sd.length;i++)
		{
			
			System.out.println( sd[i]);
		}
		

		char ani[]=s.toCharArray();

		int count;

		for(int i=0;i<ani.length;i++){

		count=1;

		for(int j=i+1; j<ani.length;j++){

		if(ani[i]==ani[j] && ani[i] !=' '){

		count++;
		}





		}


		if (count>1 && ani[i] !=0)
		{
		System.out.println(ani[i]);
		}
		}



		}
	}

