package ex03;

public class Tv {
//public이 default
	String color;
	boolean power;
	int channel;
	
	
	//생성자의 역할 : 멤버변수 초기화 이용될 수 있다.
	Tv() {
		this("white",11,false);	//this는 맨 위에 써줘야함 
		System.out.println("기본 생성자");
	}
	
	Tv(String color){
		this(color,11,false);
	}
	
	Tv(int channel) {
		this.channel = channel;
		this.color = "white";
		this.power = false;
	}
	//매개변수로 channel만 있는것 처럼, 
	//매개변수가 일부만있다면 
	//다른 속성들도 같이 기본값으로 정해주는게 좋다.
	//다른 속성들을 같이 안써주면
	//	Java에서 자동으로 default값 
	//	null,0,false을 값으로 넣어주기 때문에,
	//	부정확하고 안정적이지 않기 때문이다.
	
	Tv(String color,  int channel,boolean power){
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	Tv(boolean power, int channel){
		this.power = power;
		this.channel = channel;
		this.color = "white";
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
