package ex09;

import java.util.Scanner;

public class Exam03 {
	
	public static void main(String[] args) {
		
		double[][] jumsu = new double[2][3];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i<2;i++) {
			System.out.println("학생 번호"+(i+1));
			System.out.println("국어 점수 : ");
			jumsu[i][0] = scan.nextDouble();

			System.out.println("수학 점수 : ");
			jumsu[i][1] = scan.nextDouble();
			
			jumsu[i][2] = (jumsu[i][0]+jumsu[i][1])/2;	
		}
		for(int i = 0 ; i<2; i++) {
		System.out.println("학생 번호 : " + (i+1));
		System.out.print("국어 점수 : " + jumsu[i][0] + " ");
		System.out.print("수학 점수 : " + jumsu[i][1] + " ");
		System.out.println("평균 점수 : " + jumsu[i][2]);
	}
	}
	
}
