package ex13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapCollection{

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(45, "Toy1");
		map.put(45, "Toy3");
		map.put(35, "Robot");
		map.put(25, "Box");
		map.put(15, "Toy");
		map.put(45, "Toy2");
		//index값이 동일하면 나중에 쓰여진 index의 data로 출력됨
		//put은 삽입의 역할과 수정의 역할을 수행 함
		Set<Integer> keySet = map.keySet();

		for(int i : keySet) {
			System.out.print(i + " ");
		}

		System.out.println("\n========================");
		
		for(int i : keySet) {
			System.out.print(map.get(i) + " ");
		}
		
		System.out.println("\n======================");
		
		
		Iterator<Integer> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			System.out.println(map.get(iter.next()));
		}
		
	}

}