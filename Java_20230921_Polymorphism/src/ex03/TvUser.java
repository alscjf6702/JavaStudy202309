package ex03;

public class TvUser {
	public static void main(String[] args) {

		//객체만 변경하면 Samsung, Lg등으로 교체 가능
		Tv tv = new LgTv();
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

	}
}
