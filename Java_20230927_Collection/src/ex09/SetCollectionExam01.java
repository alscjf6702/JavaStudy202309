package ex09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//이름과 나이가 같으면 동일 인스턴스로 판단이 되도록 hashcode와 equals를 재정의 하세요.

class Person{
	private String name;
	private int age;
	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return (name.hashCode()+age)/2;
	}
	
	@Override
	public boolean equals(Object obj) {
		String _name = ((Person)obj).name;
		int _age = ((Person)obj).age;
		
		return name.equals(_name) && age == _age ? true: false;
	}
	
	@Override
	public String toString() {
		return name + " ( " + age + " ) ";
	}
}

public class SetCollectionExam01 {

	public static void main(String[] args) {
		
		Set<Person> set = new HashSet<>();
		
		set.add(new Person("김민철", 31));
		set.add(new Person("뽀뽀", 11));
		set.add(new Person("지화원", 31));
		set.add(new Person("삐삐", 12));
		set.add(new Person("김동구", 3));
		set.add(new Person("김동구", 3));
		set.add(new Person("뽀뽀", 11));
		set.add(new Person("김민철", 31));
		set.add(new Person("삐삐", 12));
		set.add(new Person("지화원", 31));
		set.add(new Person("김민철", 31));
		set.add(new Person("김동구", 1));
		set.add(new Person("뽀뽀", 11));
		set.add(new Person("삐삐", 12));
		set.add(new Person("김동구", 3));
		
		Iterator<Person> iter = set.iterator();
		System.out.println("====while문====");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("====for문====");
		for(Person s : set) {
			System.out.println(s);
		}
		
	}
}