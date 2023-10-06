package ex10;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExam{

	public static void main(String[] args) {
//TreeSet은 정수 데이터를 읽어올때 낮은수부터 읽어옴
		Set<Integer> tree = new TreeSet<>();
		
		tree.add(3);
		tree.add(2);
		tree.add(4);
		tree.add(5);
		
		for(int num : tree) {
			System.out.println(num);
		}
		
	}
}