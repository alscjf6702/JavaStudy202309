package ex02;

public class Tv {
//public이 default
	String color;
	boolean power;
	int channel;
	
	
	
	Tv() {
		System.out.println("기본 생성자");
	}
	
	Tv(int n) {
		System.out.println("1개 변수");
	}
	
	Tv(String s , int n){
		System.out.println("2개의 변수 다른 데이터타입");
	}

	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelUp(int n) {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	
}
