package ex04;

public class Main {
	
	public static void main(String[] args) {
		
		A ab = new B();
		
		ab.funcA();
		
		B b = new B();
		b.funcA();
		b.funcB();
		
		
		A aa = new B();
		System.out.println("===");
		aa.funcA();
		System.out.println("===");
		
		B bb= (B)aa;
		bb.funcA();
		bb.funcB();
		
		A a = new A();
		a.funcA();
	}	
	
}
