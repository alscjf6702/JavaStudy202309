package ex08_singleton;

//범위 public > protected > default > private
//아무것도 없다면 default
public class B {

	public static void main(String[] args) {

		A a = new A();
		
		a.number = 10;
		//a.number2 = 20;
		a.number3 = 30;
		a.number4 = 40;
		
		
		
	}
}
