package eee;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {
	private String name;
	private int age;
	private int eyes;

	public Person(String name, int age, int eyes) {
		super();
		this.name = name;
		this.age = age;
		this.eyes = eyes;
	}

	@Override
	public int hashCode() {
		return (name.hashCode() + age + eyes) / 3;
	}

	@Override
	public boolean equals(Object obj) {
		String _name = ((Person) obj).name;
		int _age = ((Person) obj).age;
		int _eyes = ((Person) obj).eyes;
		return name.equals(_name) && age == _age && eyes == _eyes ? true : false;
	}

	@Override
	public String toString() {
		return name + "(" + age + ")" + " 눈의 개수 : " + eyes;
	}

}

public class SetCollectionSelfExam01 {
	public static void main(String[] args) {

		Set<Person> set = new HashSet<>();

		set.add(new Person("김민철", 21, 2));
		set.add(new Person("방구", 21, 2));
		set.add(new Person("지화원", 21, 3));
		set.add(new Person("김민철", 21, 1));
		set.add(new Person("김민철", 21, 2));
		set.add(new Person("김민철", 21, 1));

		Iterator<Person> iter = set.iterator();

		for (Person s : set) {
			System.out.println(s);
		}
	}
}