package ex07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;


class Num {
	private int num;

	public Num(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
//		return num + "";	//정수 + 문자열 = 문자열 / 실수 + 문자열 = 문자열 / 실수 + 정수 = 실수
		return String.valueOf(num);		//정수형을 문자형으로 변경 10 => "10"
	}

	@Override
	public int hashCode() {
		return num%3;
	}

	@Override
	public boolean equals(Object obj) {
//		if(num == ((Num)obj).num)
//			return true;
//		else return false;
		
		return num == ((Num)obj).num ? true : false;
	}

	
	
}

public class SetCollection03 {


	public static void main(String[] args) {
		//Set은 순서가 상관없다. 그래서 출력이 마음대로 나온다.
		Set<Num> set = new HashSet<>();
		
		set.add(new Num(5902));
		set.add(new Num(5152));
		set.add(new Num(5152));
		set.add(new Num(5));
		set.add(new Num(9141));

		Iterator<Num> iter = set.iterator();
		Num i;
		while(iter.hasNext()) {
			i = iter.next();
			System.out.println(i);
		}
		System.out.println("==============");
		iter = set.iterator();
		while(iter.hasNext()) {
			if(iter.equals(5902)) {
				iter.remove();
			}System.out.println(iter.next());
		}
		System.out.println("=======");
		iter= set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
