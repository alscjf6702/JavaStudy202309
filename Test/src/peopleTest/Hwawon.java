package peopleTest;

public class Hwawon extends People{
	//상위클래스의 sleeping메서드를 하위클래스인 Hwawon에서 
	//Overriding해서 재정의
	void sleeping() {
		System.out.println("화원이는 새근새근");
	}
}
