
public class Max3number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 11,23,34,56,67,78 };
		int max = a[0];
		int max2 = a[0];
		int max3 = a[0];

		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {

				max = a[i];

			}
			
		}
		System.out.println("the max no. is -->" + max);
		
		
		for (int i = 0; i < a.length; i++) {

			if (a[i]<max && max2<a[i]) {

				max2 = a[i];

			}
			
		}
		System.out.println("the max2 no. is -->" + max2);

		for (int i = 0; i < a.length; i++) {

			if (a[i]<max2 && max3<a[i]) {

				max3 = a[i];

			}
			
		}
		System.out.println("the max3 no. is -->" + max3);
		
		
	}
}
