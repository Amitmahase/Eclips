import java.util.HashMap;
import java.util.Map;

public class Repeatationchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I am learning java java learning";
		Integer  count=1;

		String [] words = s.split(" ");

		Map<String, Integer> hm=new HashMap<String, Integer>();
		for(int i=0;i<words.length;i++)
			
		{
			if(!hm.containsKey(words[i]))
			{
				
			 hm.put(words[i], count);
			}
			
			else
			{
				
				hm.put(words[i], hm.get(words[i]+1));
			}
			
		}
		
		for(String x:hm.keySet())
		System.out.println("The count of the words " + x+ "="+hm.get(x));
	
		
	}

}
