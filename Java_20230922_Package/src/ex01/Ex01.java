package ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ex01 {
	
	public static void main(String[] args) {
		
		ArrayList<String> dd = new ArrayList<String>();
		dd.add("ggg");
		dd.add("gg");
		dd.add("wodo");
		dd.add(3, "gokgo");
		System.out.println(dd);

		System.out.println(dd.isEmpty());

		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		
		hs.put(1, "hi");
		hs.put(14, "good");
		hs.put(33, "gpgp");
		
		System.out.println(hs);
		
		System.out.println(hs.get(33));
		
		
		//.equals는 int a =0 ;처럼 객체생성안한 곳에는 사용 불가
		//.equals를 사용하려면 객체 생성 후 사용필요
		Integer a = new Integer(33);
		Integer b = new Integer(44);
		Integer c = new Integer(33);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(!b.equals(c));
		double aa = 10;
		double bb= 20;
		int g= 10;
		int h = 20;
		System.out.println(Math.max((int)aa, (int)bb));
		System.out.println(Math.max(g, h));
		
		
		
		
		
	}
	
}
