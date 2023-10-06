package ex02_3;

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
class Box<T extends Number> {
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
		
		Box<Double> abox = new Box<>();
	
		
	}
}
