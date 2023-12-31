package ex10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exam01 {
	public static void main(String[] args) {
		System.out.println("===ArrayList<String> ===");
		ArrayList<String> a = new ArrayList<String>();

		// 기본 16칸

		int[] b = new int[10];

		a.add("Kor");
		a.add("문자열10");
		System.out.println(a);

		System.out.println("=== ArrayList ===");
		ArrayList g = new ArrayList();

		g.add("gg");
		g.add(10);
		g.add(10.4);

		System.out.println(g);

		System.out.println("=== LinkedList ===");
		LinkedList c = new LinkedList();
		c.add("Eng");
		c.add(123);
		c.add(14.14);
		c.clear();

		System.out.println(c);
		System.out.println(c.isEmpty());

		c.add("kor");
		System.out.println(c);

		
		System.out.println("=== List ===");
		List r = new ArrayList();
		r.add("good");
		r.add(31);
		r.add(13.15);

		for (Object o : r) {
			System.out.print(o + " ");
		}

	}
}
