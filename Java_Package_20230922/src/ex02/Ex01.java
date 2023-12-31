package ex02;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Ex01 {

	public static void main(String[] args) {

		Person p1 = new Person("김민철", 20);
		Person p2 = new Person("김민철", 20);
		Person p3 = new Person("김민철");
		Person p4 = new Person("김민철");
		System.out.println(p1.equals(p2));
		System.out.println(p3.equals(p4));
		System.out.println(p1.equals(p3));

		String text3 = new String("sample");
		String text4 = new String("sample");
		System.out.println(text3.equals(text4));

		String a = "dd";
		String b = "dd";
		System.out.println(a.equals(b));

		// 같은 클래스를 참조하고, 값이 똑같은 객체더라도, 생성하면 주소가 달라서 같지않다고 출력 됨
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		// toString()의 경우에는 메서드 오버라이드를 안하면 주소를 출력하지만
		// toString()을 객체에서 참조하는 클래스에 @override를 해서 재정의해주면
		// return값으로 설정한 값이 나온다.

		int max = Math.max(22, 33);
		System.out.println(max);
		System.out.println(Math.min(30, 22));

	}

}

@Setter
@Getter

@ToString
class Person {
	String name;
	int age;

	public Person(String name) {
		this.name = name;

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		Person p2 = (Person) obj;
		
		return this.name.equals(p2.name) && this.age == p2.age;
	}
}
