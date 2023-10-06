package ex04;


//두 정수 합을 구하는 함수
//반환 타입 있고, 매개변수 있는 유형
public class Exam17 {

	public static void main(String[] args) {
	
		addition(3,4);
		int result = subtraction(5,2);
		
		System.out.println(result);		
	}

	private static void addition(int i, int j) {
		System.out.println(i+j);
	}

	private static int subtraction(int i, int j) {
		return i-j;
	}
}
