package ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection{

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();

		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		System.out.println("=========list출력=========");
		Iterator<String> iter = list.iterator();	//iterator 반복자 획득(중복값 획득)
		String str;
		while(iter.hasNext()) {
			str =iter.next();
			System.out.println(str);
		}
		
		System.out.println("==========remove=========");
		iter = list.iterator();	//iterator 반복자 획득(중복값 획득)
		
		while(iter.hasNext()) {
			str =iter.next();
			if(str.equals("Box")) {
				iter.remove();
			}
			System.out.println(str);
		}
		
		System.out.println("=========다시 출력=========");
		
		iter = list.iterator();	//iterator반복자는 한번 사용하면 사라져버리기 때문에 다시 반복자를 안써주면 또 출력안됨
		while(iter.hasNext()) {	//hasNext()는 다음 요소가 존재하는지 여부를 확인하기 위해 호출하는 것
			str =iter.next();
			System.out.println(str);
		}
		
	
		
	}
	
}
