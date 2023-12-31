package ex05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection{

	public static void main(String[] args) {
		
//		set<String> set = new Linkedset<String>();
		//Set은 중복을 없앤다.
		Set<String> set = new HashSet<String>();
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box");
		
		for(String s : set){
			System.out.println(s);
		}
		
		//중복을 index까지 없애버림
		System.out.println(set.size());
		
		System.out.println("=========set출력=========");
		Iterator<String> iter = set.iterator();	//iterator 반복자 획득(중복값 획득)
		String str;
		while(iter.hasNext()) {
			str =iter.next();
			System.out.println(str);
		}
		
		System.out.println("==========remove=========");
		iter = set.iterator();	//iterator 반복자 획득(중복값 획득)
		
		while(iter.hasNext()) {
			str =iter.next();
			if(str.equals("Box")) {
				iter.remove();
			}
			System.out.println(str);
		}
		
		System.out.println("=========다시 출력=========");
		
		iter = set.iterator();	//iterator반복자는 한번 사용하면 사라져버리기 때문에 다시 반복자를 안써주면 또 출력안됨
		while(iter.hasNext()) {	//hasNext()는 다음 요소가 존재하는지 여부를 확인하기 위해 호출하는 것
			str =iter.next();
			System.out.println(str);
		}
		
	
		
	}
	
}
