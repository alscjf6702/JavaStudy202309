package ex09_Inher;

public class PhoneExam01 {

	public static void main(String[] args) {
		
		Phone p = new Phone("apple", "white");
		p.bell();
		p.sendVoice("안녕 친구야");
		p.hangUp();
		
		System.out.println("========");
		
		SmartPhone sp = new SmartPhone("Android","black",true);
		sp.bell();
		sp.sendVoice("그래 친구야");
		sp.hangUp();
		System.out.println(sp.model + " " + sp.color + " " + sp.wifi);
		sp.youtube();
	}
}
