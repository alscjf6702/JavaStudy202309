package ex14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OtherExam {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
//		List<Integer> list = {10,20,30,40,50); 이렇게 안됨

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		// 배열은 이렇게 한번에 추가가 가능함
		int[] intNum = new int[5];
		int[] intNum2 = { 10, 20, 30, 40 };

		List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50); // 이렇게 하면 한번에 삽입가능

		for (int i : list2) {
			System.out.print(i + " ");
		}
		List<String> list3 = Arrays.asList("Toy", "Box", "Robot"); // 이렇게 하면 한번에 삽입가능
		System.out.print("\n");
		for (String i : list3) {
			System.out.print(i + " ");
		}

		System.out.println();
//		list3.add("Box"); 		사용불가 Arrays.asList(); 로 넣어준 값은 추가를 못 함

		System.out.println("====");

		
		System.out.println("ArrayList에 추가로 데이터를 삽입해주고 싶을 때");
		List<String> list5 = new ArrayList<String>(list3);
		list5.add("Box");
		list5.add("Robot");
		list5.add("gogo");
		
		for(String s : list5) {
			System.out.println(s);
		}
		
	}

}