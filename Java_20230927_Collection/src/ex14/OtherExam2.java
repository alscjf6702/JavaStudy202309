package ex14;

import java.util.Arrays;

public class OtherExam2 {

	public static void main(String[] args) {

		int[] arr = { 1, 7, 3, 7, 8, 9, 10, 2, 4 };

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();

		
		Arrays.sort(arr);	//Arrays.sort()  = >  정렬
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		String[] str = { "Box", "Toy", "toy", "Robot", "box", "robot" };
		Arrays.sort(str);	//Arrays.sort()  = >  정렬 string의 경우 앞글자의 아스키코드순대로 정렬
		for (String s : str) {
			System.out.print(s + " ");
		}
		
	

	}

}
