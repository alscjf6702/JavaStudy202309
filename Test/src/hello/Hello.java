package hello;

public class Hello {
	
	static Hello hi = new Hello();
	
	int app = 150;
	int kor = 200;
	
	private Hello() {
		
	}
	
	public static Hello getInstance() {
		
		return hi;
	}
	
}
