package programpractice;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[]= {23,435,6,45,657,65,578,869,9};
		//Arrays.sort(a);
		
		//System.out.println(Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));

	}

}
