class A {
	
	void showA(){
		
		System.out.println("Show A is running ");
		}

}

	
class C extends A{
	
	void showC() {
		System.out.println("Show C is running");
		}
	
	public static void main(String[] args) {
		A S1=new A();
	
		C S3=new C();
		S1.showA();
	
		
		S3.showA();
		//S3.showB();
		S3.showC();
	
		
	}
	
	
	
	}
