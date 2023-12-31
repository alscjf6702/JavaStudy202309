package ex13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapCollectionSelfExam {

	public static void main(String[] args) {
		
		Map<Integer , String> map = new HashMap<>();
		
		map.put(2, "김민철");
		map.put(44, "지화원");
		map.put(4, "동구");
		map.put(6, "만두");
		map.put(17, "뽀뽀");
		map.put(22, "삐삐");
		
		System.out.println(map);
		
		Set<Integer> keySet = map.keySet();
		
		Iterator<Integer> iter = keySet.iterator();
		System.out.println("===");
		for(int i :keySet) {
			System.out.println(map.get(iter.next()));
		}
		
		iter=keySet.iterator();
		
		System.out.println("===");
		while(iter.hasNext()) {
			System.out.println(map.get(iter.next()));
		}
		
	}
	
}
