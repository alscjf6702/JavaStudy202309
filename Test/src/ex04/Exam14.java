package ex04;

public class Exam14 {

	
	public static void main(String[] args) {
		
		//문자열이 "12345"이면 개별문자로 분리해서 합을 구하는 프로그램 구현(합15)
		//String 클래스 charAt(int i)를 이용
		
		String str = "536412";
		int sum = 0;
		
		for(int i = 0 ; i <str.length(); i++) {
			char d = str.charAt(i);
			sum += d-'0';
			System.out.println(d);
		}
		
		System.out.println("sum : " + sum);
		
	}
}
