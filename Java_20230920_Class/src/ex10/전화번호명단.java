package ex10;

public class 전화번호명단 {

	public static void main(String[] args) {
		대학동창 조 = new 대학동창("조조",30,"컴퓨터공학");
//		조.전공 = "컴퓨터공학";
//		조.이름 = "조조";
//		조.나이 = 30;
		
//		System.out.println(조.get이름());
		//Getter 생성자를 이용해서 private으로 제한된 변수를 호출해 올 수 있다.
		조.사람info();
		
//		private으로 되어있는 변수를 public 메서드에 넣어줌으로써
//		메서드를 이용하여 호출해 올 수 있다.
		
		
		System.out.println("=========");
		동호회 동 = new 동호회("유비",35,"칼싸움");
		동.사람info();
		
		
		
		System.out.println("=========");
		
		
	}
	
}
