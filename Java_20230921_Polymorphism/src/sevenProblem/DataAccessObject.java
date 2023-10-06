package sevenProblem;

public interface DataAccessObject {
	public void select();
	public void insert();
	public void update();
	public void delete();
	
	//default 메서드 - 인터페이스에서 추상메서드만 사용가능하나
	//일반메서드를 사용할 수 있게 해주며,
	//메서드를 반드시 상속받는 클래스에 넣어줘야하는 추상메서드와는 다르게
	//default메서드는 구현을 원하는 클래스에만 넣어서 사용할 수 있다.
	default void dodo2() {
		System.out.println("default 메서드");
	}
	
	
	//정적메서드 구현객체가 없어도 사용 할 수 있다.
	//정적메서드는 구현객체 없이 클래스명.메서드명 써주면 출력 됨
	static void dodo() {
		System.out.println("static 메서드");
	}
	
}
