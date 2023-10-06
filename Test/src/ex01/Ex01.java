package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		for ( double i = 0 ; i < 30 ; i = i + 0.01) {
			num1 += i;
		}
		System.out.println(num1);
		
	}
	
}
