package ex09;

class Box<T> {
	private T ob;
	public void set(T ob) {this.ob = ob;}
	public T get() {return this.ob;}
	
	@Override
	public String toString() {return ob.toString();}

}

class Unboxer {
	public static void peekBox(Box<? super Integer> box) {	//와일드카드 메서드
		System.out.println(box);
	}
	
	
}

public class WildCardUnBox {
	public static void main(String[] args) {

		Box<Integer> iBox = new Box<>();
		iBox.set(9999);
		
		Box<Number> nBox = new Box<>();
		nBox.set(10.5);
		
		Box<Object> bBox = new Box<>();
		bBox.set("Simple");
		Unboxer.peekBox(iBox);
		Unboxer.peekBox(nBox);
		Unboxer.peekBox(bBox);

		
	}
}
