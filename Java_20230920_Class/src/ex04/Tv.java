package ex04;

public class Tv {
//public이 default
	String color;
	boolean power;
	int channel;
	
	
	//생성자의 역할 : 멤버변수 초기화 이용될 수 있다.
	Tv() {
		System.out.println("기본 생성자");
	}
	
	Tv(int channel) {
		this.channel = channel;
	}
	
	Tv(String color, boolean power, int channel){
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	
}
