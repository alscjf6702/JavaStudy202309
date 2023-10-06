package peopleTest;

public class Minchul extends People{
	//상위클래스의 sleeping메서드를 하위클래스인 Minchul에서 
	//Overriding해서 재정의
	void sleeping() {
		System.out.println("민철이는 드르릉드르릉");
	}
}
