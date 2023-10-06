package ex04;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		
		int jumsu = scan.nextInt();
		
		if (jumsu > 100) {
			System.out.println("0 ~ 100사이의 점수를 입력하세요.");
		} else if (jumsu >= 90) {
			System.out.println("A");
		} else if (jumsu >= 80) {
			System.out.println("B");
		} else if (jumsu >= 70) {
			System.out.println("C");
		} else if (jumsu >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		scan.close();
	}
}
