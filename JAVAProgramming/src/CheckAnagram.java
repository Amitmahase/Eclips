import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1="stop";
		String s2="tops";
		
		
		char arr1[]=s1.toLowerCase().toCharArray();
		char arr2[]=s2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2))
		{
			
		System.out.println("The words are Anagram");
			
		}
		else
		{
			System.out.println("The words are not Anagram");
		}

	}

}
