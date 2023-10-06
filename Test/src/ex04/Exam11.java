package ex04;


//두 정수 합을 구하는 함수
//반환 타입 있고, 매개변수 있는 유형
public class Exam11 {

	public static void main(String[] args) {
		float sum = add(10,40);
		System.out.println(sum);
	}
	
	//반환 타입 함수명(매개변수)
	public static float add(float num1 , float num2) {
		
		return num1+num2;
		
	}
	
}
