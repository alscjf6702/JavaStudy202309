package ex04;

public class Exam05 {
	public static void main(String[] args) {

		int a = 1515;
		int b = 444;
		int c = 667;

		if (a > b) {
			if (a > c) {
				System.out.println("a가 가장 큰 값 입니다." + a);
			}
		}
		if (b > a) {
			if (b > c) {
				System.out.println("b가 가장 큰 값 입니다." + b);
			}
		}
		if (a < c) {
			if (c > b)
				System.out.println("c가 가장 큰 값 입니다." + c);
		}
		
		if (a < b) {
			if (a < c) {
				System.out.println("a가 가장 작은 값 입니다." + a);
			}
		}
		if (b < a) {
			if (b < c) {
				System.out.println("b가 가장 작은 값 입니다." + b);
			}
		}
		if (a > c) {
			if (c < b)
				System.out.println("c가 가장 작은 값 입니다." + c);
		}
		
		
	}
}
