package ex02;

public class Ex02 {

	public static void main(String[] args) {
		//StringBuffer는 동기화 됨
		StringBuffer a = new StringBuffer("hi");

		StringBuffer b = a;

		b.append(" ooo");
		
		a.append(" Heello");

		System.out.println(a);
		System.out.println(b);

		System.out.println("=====");
		
		
		//Integer는 null을 집어넣을 수 있다. 참조하는 곳이 없다는 뜻.
		Integer intJ = null;
		//int의 경우 null을 집어넣지 못한다. 오직 0을 포함한 정수만 삽입 가능.
		int iii = 0;
		
		
		
		
	}

}
