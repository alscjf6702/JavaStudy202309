package ex01;

import java.util.Scanner;

public class Mowam {

	String ff = "32313";
	
	public static void main(String[] args) {
		String ff = "23123";
		String fs = "22";
		
		System.out.println(('3'-'0')+('9'-'0'));
		
		
		String doo = "2093";
		String ko = "2991";
		
		System.out.println(Integer.parseInt(doo)+Integer.parseInt(ko));

		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		String b = scan.nextLine();
		String c = scan.nextLine();
		
		double avg = (Double.parseDouble(a) + Double.parseDouble(b) + Double.parseDouble(c))/3;
	
		System.out.printf("점수의 평균은 : %.2f ",avg);
	
	
	}
	
}
