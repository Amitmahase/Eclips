package ArraysDemo;

public class MinNumberFromArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// find the lowest number in array

		int a[][] = { { 91, 23, 99, 31 }, { 31, 45, 61, 89 }, { 29, 33, 39, 4 } };
		int min = a[0][0];
		int max = a[0][0];
		int mincolumn = 0;
		int l = a.length;
		int leng = l;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < min)

				{
					min = a[i][j];
					mincolumn = j;
				}

			}

		}

		System.out.println("min number: " + mincolumn);

		for (int k = 0; k < l - 1; k++) {

			if (a[k][mincolumn] > max) {

				max = a[k][mincolumn];

			}
		}

		System.out.println("the max no. is =" + max);
		System.out.println(min);

	}
}
