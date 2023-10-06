package ex02;

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


class AppleBox{ //사과 담는 박스
	private Apple ap;
	
	void setApple(Apple ap) {
		this.ap=ap;
	}
	Apple getApple() {
	return ap;	
	}
}

class OrangeBox{ //오렌지 담는 박스
	private Orange og;
	
	void setOrange(Orange og) {
		this.og=og;
	}
	Orange getOrange() {
		return og;	
	}
}

public class Generices1 {

	public static void main(String[] args) {
		
		AppleBox abox = new AppleBox();
		OrangeBox obox = new OrangeBox();
		
		abox.setApple(new Apple());
		obox.setOrange(new Orange());
		
		Apple a = abox.getApple();
		Orange o = obox.getOrange();
		System.out.println(a);
		System.out.println(o.toString());
		
	}	
	
	
	
}
