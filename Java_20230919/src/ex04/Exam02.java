package ex04;

import java.util.Iterator;

public class Exam02 {

	public static void main(String[] args) {
		//배열에 10의 공간 선언
		int[] numA = new int[10];
		//numA[i]에 공간의 개수만큼 1~10데이터 넣어줌
		for(int i = 0 ; i<numA.length; i++) {
			numA[i] = i+1;
		}
		//1~10까지 넣어준 데이터를 출력
		System.out.println("기존 데이터 : " );
		for(int i = 0 ; i<numA.length; i++) {
			System.out.print(numA[i]+ " ");
		}
		
		for(int i = 0; i<100; i++) {
			int n = (int)(Math.random()*10); //0~9
			int tmp = numA[0];
			numA[0] = numA[n];
			numA[n] = tmp;
		}
		
		System.out.println("\n섞은 데이터 : " );
		for(int i = 0; i<numA.length; i++) {
			System.out.print(numA[i]+" ");
		}
	}
	
}
