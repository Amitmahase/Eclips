class Test {

	void show() {
		
		
		System.out.println("Method 1");
	}
}


class xyz extends Test
{
	void show() {
		
		
		System.out.println("Method 2");
		

		
	}

	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.show();
	}
}