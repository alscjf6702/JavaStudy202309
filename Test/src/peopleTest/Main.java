package peopleTest;

public class Main {

	public static void main(String[] args) {
		//레퍼런스 명 p를 이용해 People클래스 객체를 생성
		People p = new People();
		//레퍼런스 명 m를 이용해 People을 참조하는 Minchul클래스 객체를 생성
		People m = new Minchul();
		//레퍼런스 명 h를 이용해 People을 참조하는 Hwawon클래스 객체를 생성
		People h = new Hwawon();
	
		p.sleeping();
		m.sleeping();
		h.sleeping();
		
		p.eat();
		m.eat();
		h.eat();
	}
}
