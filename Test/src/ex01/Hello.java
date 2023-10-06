package ex01;

public class Hello {

	public static void main(String[] args) {
	
		int sum = 0;
		for(int i =1; i<=10 ; i++) {
			sum+= i;
		}
		System.out.println("sum : " + sum);
		
		
		if(sum>50) {
			System.out.println("100이상");
			System.out.println("프로그램 종료");
		}
		
		
	}
		
	
}
