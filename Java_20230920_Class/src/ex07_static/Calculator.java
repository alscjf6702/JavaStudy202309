package ex07_static;

public class Calculator {

	int result; //인스턴스 변수
	static int minus;	//정적 변수, 클래스 변수(static)
	static int devide;
	int app;
	//인스턴스 메서드
	void add(int num1, int num2) {
		this.result = num1+num2;
		//result = num1+num2; 둘 다 쓸 수 있다.
	}
	
	//정적메서드,클래스메서드 (static)
	static void sub(int num1, int num2) {
		//this.minus = num1-num2; this를 못 쓴다.(static)
		minus = num1 - num2;
	}
	
	static void devide(int num1, int num2) {
		devide = num1/num2;
	}
}
