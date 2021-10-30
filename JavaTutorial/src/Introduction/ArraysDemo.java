package Introduction;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int[]  myintArray1= {100,90};
		//myintArray1=new int[10];
		
		//myintArray1[0]=100;
		//myintArray1[1]=111;
		
		//myintArray1
		System.out.println("0 index"+ " "+ myintArray1[0]);
		System.out.println("0 index"+ " "+ myintArray1[1]);
		//System.out.println("0 index"+ " "+ myintArray1[2]);  // it will return 0 as default value.
		
		
		
		
		String[] myfirstArray1 = {"Audi", "Honda", "BMW"};
		System.out.println("0 index"+ myfirstArray1[0]);
		System.out.println("1 index"+ myfirstArray1[1]);
		System.out.println("2 index"+ myfirstArray1[2]);
		
		int length1=myintArray1.length;
		
		int length2=myfirstArray1.length;
		
		System.out.println(length1 + " "+ length2);
		
		for(int i=0; i<length1;i++)
		{
			System.out.println(myintArray1[i]);
		}
		
		Arrays.sort(myintArray1);// sort the array in assending order.
		
		for(int i=0; i<length1;i++)
		{
		System.out.println(myintArray1[i]);
		}
		
		//String[] ani= System.arraycopy(myintArray1, length2, myfirstArray1, length1, length2);
		
	}
	

	

}
