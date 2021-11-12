package programpractice;

public class Sumofdigitsinano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =35374587;
		// sum of digits in an integer
		int sum = 0;

		while (a !=0 ) {

			sum = sum + a % 10;
			a = a / 10;
		}

		System.out.println(sum);
	}

}
