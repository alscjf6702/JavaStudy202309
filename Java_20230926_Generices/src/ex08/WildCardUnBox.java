package ex08;

class Box<T> {
	private T ob;
	public void set(T ob) {this.ob = ob;}
	public T get() {return this.ob;}
	
	@Override
	public String toString() {return ob.toString();}

}

class Unboxer {
	public static void peekBox(Box<? extends Number> box) {	//와일드카드 메서드
		System.out.println(box);
	}
}

public class WildCardUnBox {
	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.set(1234);
		
		Box<Double> dbox = new Box<>();
		dbox.set(12.9);
		
		Unboxer.peekBox(box);
		Unboxer.peekBox(dbox);
		
		System.out.println(box.get());
		System.out.println(dbox.get());
	}
}
