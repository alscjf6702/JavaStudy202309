package ex10;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Doodp {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put(1, "ho");
		map.put(3, "55o");
		map.put(44, 44);
		map.put(454, "gg");
		
		System.out.println(map);
		System.out.println(map.get(454));
		
		
		LinkedList list = new LinkedList();
		
		list.add("hh");
		list.addLast("last");
		list.add("hs");
		list.add(51);
		list.addFirst("First");
		list.add(3, 44);
		
		System.out.println(list);
		
		System.out.println(list.get(3));
	}
	
}
