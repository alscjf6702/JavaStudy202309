package teacher;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Student[] students = new Student[3];
		int total = 0;
		double average = 0;
		students[0] = new Student("김민철", 30,100,99,97);
		students[1] = new Student("지화원", 30,60,79,47);
		students[2] = new Student("김동구", 5,10,9,7);
	
		
		for(int i = 0 ; i<students.length ;i++) {
			System.out.println(students[i]+ " ");
//			System.out.println(students[i].toString()+ " ");
			total += students[i].sum();
		}
		
		
		average = (double)total/students.length;
		
		System.out.printf("전체 총점 : %d\t", total);
		System.out.printf("전체 평균 : %.2f " , average);
	}
}
