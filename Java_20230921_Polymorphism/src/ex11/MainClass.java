package ex11;

public class MainClass {
	public static void main(String[] args) {

		func(new D());

	}

	static void func(Object obj) {
		//instanceof 연산자
		//좌항의 객체가 우항의 객체와 같으면 true, 다르면 false를 출력한다.
		if (obj instanceof A) {
			A a = (A) obj;
			a.funcA();
		}
		System.out.println("종료");

	}
}