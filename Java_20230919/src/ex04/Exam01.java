package ex04;

import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {
		// 1. 랜덤을 이용해서 5명학생 점수를 입력받는다.

		int[] score = new int[5];
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random() * 100) + 1;
			sum += score[i];
			System.out.println("학생" + (i + 1) + " : " + score[i]);
		}
		
		
		// 2. 5명 점수의 총점과 평균을 구한다.
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double) sum / score.length);

		System.out.println("==============================");

		
		// 3. 최대값, 최소값 출력
		
		System.out.println("==============================");
		int min = score[0];
		int max = score[0];
		for (int i = 0; i < score.length; i++) {
			if (min > score[i]) {
				min = score[i];
			}
			if (max < score[i]) {
				max = score[i];
			}
		}

		System.out.println(min);
		System.out.println(max);

		
		// 4. 입력 데이터를 오름차순으로 정렬
		
		System.out.println("==============================");
		
		for(int i = 0 ; i<score.length; i++) {
			boolean flag = false;
			for(int j=0; j<score.length-1; j++) {		
				if(score[j]>score[j+1]) {
					int tmp = score[j];
					score[j] = score[j+1];
					score[j+1] = tmp;
					flag = true;
				}	
			}if(!flag) break;
		}
			System.out.println("정렬 데이터");
			for(int i = 0; i<score.length; i++) {
				System.out.print(score[i]+" ");
			
		}
		
		


	}

}
