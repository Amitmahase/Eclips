package apna;

class unning {

	int a;
	String b;

	public static void work(int a, String b) {
		System.out.println("m1 method");

	}

}

class Methodover extends unning {

	int a;
	String b;

	public static void work(int a, String b) {
		System.out.println("m2 method");

	}
}

class Running {

	public static void main(String[] args) {

		Methodover m = new Methodover();

		m.work(10, "ajiej");
		
		unning r=new unning();
		r.work(10, "shch");

	}

}

// {
// TODO Auto-generated method stub
