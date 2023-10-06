package ex05;

public class Tv {
//public이 default
	String color;
	boolean power;
	int channel;
	int volume;
	
	
	//생성자의 역할 : 멤버변수 초기화 이용될 수 있다.
	Tv() {
		this("Green",false,11,50);
		System.out.println("기본 생성자");
	}
	
	Tv(int channel) {
		this("Pink",false,channel, 11);
	}
	
	Tv(String color){
		this(color,false,37,44);
	}
	
	Tv(int channel, int volume){
		this("oceanblue",false,channel,volume);
	}
	
	Tv(String color, boolean power, int channel, int volume){
		this.color = color;
		this.power = power;
		this.channel = channel;
		this.volume = volume;
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
