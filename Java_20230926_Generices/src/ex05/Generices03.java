//제네릭타입 = 클래스나 메서드를 정의할 때 타입(데이터 유형)을 매개변수화할 수 있는 기능
package ex05;

class Box<T> { // 제네릭 타입 T를 사용한 Box 클래스 생성
	private T ob; // 제네릭 타입 T로 이루어진 obj 변수(상자에 저장된 객체)를 선언

	public Box(T ob) {
		this.ob=ob;
}

	public void set(T ob) { // 객체 저장
		this.ob = ob;
	}

	public T get() { // 객체 반환
		return this.ob;
	}
}

class SteelBox<T> extends Box<T> {
	public SteelBox(T ob) {
		super(ob);
	}
}

public class Generices03 {
	public static void main(String[] args) {
		Box<Integer> iBox  = new SteelBox(new Integer(9999));
		Box<String> sBox = new SteelBox(new String("Sweet"));
		Box<Integer> sBox2 = new SteelBox(new Integer(232));
		
		System.out.println(iBox.get());
		System.out.println(sBox.get());
		System.out.println(sBox2.get());
		
	}
}
