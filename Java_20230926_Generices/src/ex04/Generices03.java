//제네릭타입 = 클래스나 메서드를 정의할 때 타입(데이터 유형)을 매개변수화할 수 있는 기능
package ex04;

class Box<T> { // 제네릭 타입 T를 사용한 Box 클래스 생성
	private T obj; // 제네릭 타입 T로 이루어진 obj 변수(상자에 저장된 객체)를 선언

	public void set(T obj) { // 객체 저장
		this.obj = obj;
	}

	public T get() { // 객체 반환
		return this.obj;
	}
}

class BoxFactory {
	public static <T extends Number> Box<T> makeBox(T o) {
		Box<T> box = new Box<T>();
		box.set(o);

		System.out.println("Boxed data : " + o.intValue());
		return box;
	}
}
//============================================================================================

class Unboxer { // 상자를 열어주는(Unboxer)클래스
	public static <T extends Number> T openBox(Box<T> box) { // Box<T> 타입의 상자를 받아서 상자 안에 저장된 객체를 반환
		System.out.println("unBoxed data : " + box.get().intValue());
		return box.get();
	}
}
//============================================================================================

public class Generices03 {
	public static void main(String[] args) {

//Box<Integer> sBox = BoxFactory.<Integer>makeBox(new Integer(9898));
		Box<Integer> sBox = BoxFactory.makeBox(554144);

		int n = Unboxer.openBox(sBox);
		System.out.println(n);
		
		
		
	}
}
