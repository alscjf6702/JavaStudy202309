package ex00;

class A {
void funcA() {
	System.out.println("funcA ..");
}

}

class B extends A{
	void funcB() {
		System.out.println("funcB ..");
	}

}

class C extends B{
	void funcC() {
		System.out.println("funcC ..");
	}

}

public class 다형성예제 {

	public static void main(String[] args) {
		A a = new A();
		a.funcA();
		
		A a3 = new C();
		a3.funcA();
		
		A b = new B();
		b.funcA();
		
		
		
	}

}
