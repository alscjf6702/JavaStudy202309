package ex04;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

public class Main {

	public static void main(String[] args) {

		Student stu = new Student();
		int stuName = 3;
		int stuData = 7;
		String[][] students = new String[stuName][stuData];

		Scanner scan = new Scanner(System.in);

		String sum = String.valueOf(0);
		for (int j = 0; j < stuName; j++) {
			for (int i = 2; i <= 4; i++) {
				sum += students[j][i];
			}

		}
//		System.out.println("해당 학생의 총점은 : " + stu.sum());

//		System.out.println("해당 학생의 평균은 : " + Integer.parseInt(Student.avg()));

		students[0][0] = "김민철";
		students[0][1] = "나이 : 31";
		students[0][2] = "99";
		students[0][3] = "100";
		students[0][4] = "98";
		students[0][5] = "총점 : " + String.valueOf(sum);
		students[0][6] = "평균 : " + String.valueOf(stu.avg());

		students[1][0] = "지화원";
		students[1][1] = "나이 : 34";
		students[1][2] = "66";
		students[1][3] = "44";
		students[1][4] = "55";
		students[1][5] = "총점 : " + String.valueOf(stu.sum());
		students[1][6] = "평균 : " + String.valueOf(stu.avg());

		students[2][0] = "김동구";
		students[2][1] = "나이 : 5";
		students[2][2] = "11";
		students[2][3] = "12";
		students[2][4] = "4";

//			try {
//				int kor = Integer.parseInt(students[1][3]);
//				System.out.println(kor);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}

		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum1 = 0;
		double avg = 0;
//		try {
		
		
		
		
		String irum = null;
		boolean flag2 = false;
		while (!flag2) {
			System.out.println("학생의 이름을 입력하세요");
			irum = scan.nextLine();

			boolean flag = false;
			int numId = -1;
//			int dd = Integer.parseInt(irum);
			for (int i = 0; i < 3; i++) {
				if (irum.equals(students[i][0])) {
					numId = i;
					flag = true;
					break;
				}
			}

			if (flag) {
				for (int i = 0; i < stuName; i++) {
					for (int g = 0; g < 2; g++) {
						if (irum.equals(students[i][0])) {
							System.out.println(students[i][g]);

							kor = Integer.parseInt(students[i][2]);
							eng = Integer.parseInt(students[i][3]);
							math = Integer.parseInt(students[i][4]);

							sum1 = kor + eng + math;
							avg = sum1 / 3;
							flag2 = true;
						}
					}
				}
			}
			System.out.println("국어점수 : " + kor);
			System.out.println("영어점수 : " + eng);
			System.out.println("수학점수 : " + math);
			System.out.println("총 점 : " + sum1);
			System.out.printf("평 균 :  %.2f", avg);
//		} catch (Exception e) {
//			System.out.println("이름을 다시 입력해주세요.");
//		}

		}
	}

}

@Getter
@Setter
class Student {

	private String name;
	private static int age;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;

	public int sum() {

		return kor + eng + math;
	}

	public double avg() {

		return sum() / 3;
	}

}
