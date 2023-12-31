package ex02_2;

class Apple {
	public String toString() {
		return "I am an Apple";
	}
}

class Orange {
	public String toString() {
		return "I am an Orange";
	}
}

//제네릭 클래스
class Box<T> {
	private T obj;

	void setObj(T obj) {
		this.obj = obj;
	}

	T getObj() {
		return obj;
	}
}

public class Generices1 {

	public static void main(String[] args) {

		Box<Apple> aBox = new Box<Apple>(); //generic의 경우 Box에 <>에 설정된 Apple만 집어넣을 수 있다.
		aBox.setObj(new Apple());
//		aBox.setObj(new Orange());	//Orange클래스가 apple클래스를 상속받으면 이렇게 사용 가능.
		Apple ap = aBox.getObj();
		System.out.println(ap);
//		Apple op = aBox.getObj();
//		System.out.println(op);
		
		Box<Orange> oBox = new Box<Orange>();
		
		oBox.setObj(new Orange());
		
		Orange or = oBox.getObj(); //형변환 할필요 없뜨
		System.out.println(or);
//		Box aBox = new Box();
//		aBox.setObj(new Apple());
//		System.out.println(aBox.getObj());
//		aBox.setObj(new Orange());
//		System.out.println(aBox.getObj());

	}
}
