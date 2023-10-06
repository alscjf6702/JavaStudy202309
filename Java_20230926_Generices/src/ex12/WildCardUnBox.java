package ex12;

class Box<T> {
	private T ob;
	public void set(T ob) {this.ob = ob;}
	public T get() {return this.ob;}
	
	@Override
	public String toString() {return ob.toString();}

}

class Toy{
	@Override
	public String toString() {return "I am a Toy";}
}

class BoxHandler{					//상한제한 ==> 목적 ==> get만 가능,  set 불가능
	public static void outBox(Box<? extends Toy> box) {		//꺼내기 , get만 가능
		Toy t = box.get();			//최대 Toy클래스 이하의 하위 클래스
		System.out.println(t);
//		box.set(new Toy());		//어떤 클래스가 와일드카드에 들어올지 몰라서 오류가 발생 함
	}
									//하한제한 ==> 목적 ==> set만 가능,  get 불가능
	public static void inbox(Box<? super Toy> box, Toy n) {	//저장하기 , set만 가능
		box.set(n);					//최소Toy클래스 이상의 상위클래스
		Toy n2 = (Toy)box.get();	
		System.out.println(n2);
	}
}


public class WildCardUnBox {
	public static void main(String[] args) {
		
		Box<Toy> box = new Box<>();
		BoxHandler.inbox(box, new Toy());
		BoxHandler.outBox(box);
		
	}
}
