package ex10;

public class 대학동창 extends 사람{
	String 전공;
	public 대학동창(String 이름,int 나이, String 전공) {
		super(이름, 나이);
		this.전공 = 전공;
	}
	
	public void 사람info() {
		super.사람info();		//main에서 조.사람info를 호출하면
		//지역변수는 자기에게 제일 가까운것을 가져올라고해서 
		//대학동창 클래스에 있는 사람info를 호출한다.
		//그래서 super.으로 상위클래스인 사람 클래스의 사람info를 호출한다.
		System.out.println(전공);
	}
	
	
}
