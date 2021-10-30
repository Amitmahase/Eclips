package collectionsJava;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 4, 5, 5, 5, 4, 6, 7, 3, 7, 3, 56, 6, 9, 9 };

		// 4 is repeated 3 times, 5-5,6--2, 9--2,7--2

		// Empty ArrayList -4

		// print unique number from the list

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;

			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;

				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}

				}

				System.out.println("The element" + a[i]);
				System.out.println("is repeated " + k + "times");

			}

		}

	}

}
