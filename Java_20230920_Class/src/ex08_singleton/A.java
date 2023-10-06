package ex08_singleton;

public class A {

	//범위 public > protected > default > private
	//아무것도 없다면 default
	
	int number;
	//default는 다른class에서는 접근 가능하나,
	//다른 package에서는 접근 불가
	private int number2;
	//같은 package의 다른 class에서도 접근 불가
	public int number3;
	//package가 달라도 접근 가능
	protected int number4;
	
	void add() {
		number2= 2;
	}
	
	private void add2() {
		number = 4;
	}
	
	
}
