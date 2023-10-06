package ex09_Inher;

public class SmartPhone extends Phone{

	public boolean wifi;
	
	public SmartPhone(String model, String color, boolean wifi) {
		super(model,color); //상위 클래스 호출
		this.wifi = wifi;
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
	public void youtube() {
		if(this.wifi==true)
		System.out.println("유튜브에 접속한다.");
		else
			System.out.println("유튜브를 보려면 인터넷을 연결해주세요.");
	}
	
}
