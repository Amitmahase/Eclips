public class DuplicateCharacters {  
		     public static void main(String[] args) {  
		        String s1 = "Great responsibility";  
		        
		        
		        for(int i=0;i<s1.length();i++)
		        	
		        {
		        	
		        	char c1=s1.charAt(i);
		        	
		        	for (int j=i+1;j<s1.length()-1;j++)
		        	{
		        		
		        		char c2=s1.charAt(j);
		        		
		        		if(c1==c2)
		        			
		        		{
		        			
		        			System.out.println("String having duplicate values"+ c1 +" "+ c2);
		        		}
		        	}
		        }  
		    }  
		 

	}

