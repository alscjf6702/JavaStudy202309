package ex14;

import java.util.Arrays;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Person {

	private String name;
	private int age;

	@Override
	public String toString() {
		return name + "(" + age + ")";
	}

}

public class OtherExam3 {

	public static void main(String[] args) {

		Person[] person = { new Person("조조", 20), new Person("유비", 30), new Person("관우", 35) };

		Arrays.sort(person);	//정렬되지 않음 패키지 ex15에서 확인
		for (Person p : person) {
			System.out.println(p);
		}

	}

}
