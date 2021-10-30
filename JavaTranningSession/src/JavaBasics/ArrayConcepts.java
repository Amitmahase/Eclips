package JavaBasics;

public class ArrayConcepts {
	
	public static void main(String[] args_)
	{
		
		// Array: to store similar data type values in  array variable
		
		
		//1. int array:
		//lowest bound/index= 0
		//upper bound/index= n-1, (n is size of  array)
		
		//One dimensional array
		/*Static array:- size is fix (DisAdvantge)-- to overcome this problem , we =use collections,
		 *  --ArrayList---, HashTable,dynamic array*/
		
		//Stores only similar data type -- to overcome this problem we use object array;
		
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i.length);
		//System.out.println(i[4]);  // array out of bond exceptions
		
		//to print all the elements in array , we will use for loop.
		
		for(int j=0;j<i.length;j++) 
		
		{
			
			System.out.println(i[j]);
		}
		
		//double array
		
		double d[]= new double [4];
		 d[0]=11.11;
		 d[1]=22.22;
		 d[2]=33.33;
		 d[3]= 44.44;
		
		//System.out.println(d[0]);
		for(int j=0;j<d.length;j++) {
			
			System.out.println(d[j]);
		}
		//3.char array
		
		char c[]=new char[4];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		c[3]='d';
		
		//4.boolean array
		
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//5.String array
		String s[]=new String[3];
		s[0]="asd";
		s[1]="sdf";
		s[2]="sds";
		System.out.println(s.length);
		
		//6.Object array
		Object ob[]=new Object[6];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]="1/1/1990";
		ob[3]="22.22";
		ob[4]='M';
		ob[5]="london";
		System.out.println(ob[5]);
		
		for(int k=0;k<ob.length;k++) {
			
			System.out.println(ob[k]);
		
		
		
		String a[]=new String[7];
		a[0]="*";
		a[1]="**";
		a[2]="***";
		a[3]="****";
		a[4]="*****";
		a[5]="******";
		a[6]="*******";
		
			
		for (int l=0;l<a.length;l++) {
			
			System.out.println(a[l]);
			
		}
		}
		
}
	
}
	
		
		
	
	

		





