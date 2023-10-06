package ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("예외처리1");
		System.out.println("예외처리2");
		System.out.println("예외처리3");
		System.out.println("예외처리4");

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		
		int[] num2 = new int[5];
		try {
			System.out.println("try 구문에 있어도 오류 전까지는 출력 됨");
			int num = scan.nextInt();
			System.out.println(5 / num);
			System.out.println("try 구문의 오류발생하는 부분 밑에 있는 경우 출력 안됨");
//			num2[10] = 9;
		} catch (Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
			e.printStackTrace();
			System.out.println(e);
		} finally {
			System.out.println("예외처리 종료");
		}

		System.out.println("예외처리5");
		System.out.println("예외처리6");
		System.out.println("예외처리7");
		System.out.println("예외처리8");
		System.out.println("예외처리9");
		System.out.println("예외처리10");
		System.out.println("프로그램 종료!");

	}

}
