package ex02_1;

class Apple{
	public String toString() {
		return "I am an Apple";
	}
}

class Orange{
	public String toString() {
		return "I am an Orange";
	}
}

class Box{ //박스
	private Object obj;
	
	void setObj(Object obj) {
		this.obj=obj;
	}
	
	Object getObj() {
	return obj;	
	}
}

public class Generices1 {

	public static void main(String[] args) {
		Box abox = new Box();	//사과 담을 박스
		Box obox = new Box(); 	//오렌지 담을 박스
		abox.setObj(new Apple());
		obox.setObj(new Orange());
		
		Object a = abox.getObj();
		Apple a1 = (Apple)abox.getObj();
		
		Object o = obox.getObj();
		Orange o1 = (Orange)obox.getObj();
		
		System.out.println(a);
		System.out.println(o.toString());
		System.out.println(a1);
		System.out.println(o1.toString());
	}	
}
