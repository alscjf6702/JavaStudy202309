import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		System.out.println("2+4+6...100의 합");
		ex01();
		System.out.println(" ");
		
		System.out.println("50까지 5의 배수를 출력하는 프로그램");
		ex02();
		System.out.println(" ");System.out.println(" ");
		
		System.out.println("B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라");
		ex03();
		System.out.println(" ");System.out.println(" ");
		
		System.out.println("한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라");
		ex04();
		

		
	}



	public static void ex01() {
	int sum = 0;

	for (int i = 0; i <= 100; i = i + 2) {
		sum += i;
	}

	System.out.println("2+4+6+...100의 합 : " + sum);
	}

	
	public static void ex02() {
		for(int i=5; i<=50; i = i+5) {
			System.out.print(i + "\t");
		}
	}
	
	public static void ex03() {
		String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N"};
		String str = null;
		for(int i = 1; i<alpha.length; i = i+2) {
			str = alpha[i];
			System.out.print(str+"\t");
		}
		
		System.out.println(" ");
		for(int i = 66; i <=78; i+=2) {
			System.out.printf("%c\t" , i);
		}
	}
	
	public static void ex04() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = scan.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= a; i++ ) {
			sum += i;
		}
		System.out.printf("1~%d까지의 합 : %d\n" , a , sum);
	}
	
	
	
	
	
}
