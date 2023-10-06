package ex09_functionInterface;

@FunctionalInterface //추상메소드가 1개만 존재한다는 뜻
public interface SampleInterface {
	//interface 에는 일반 메서드가 들어가지못함, 추상 메서드만 존재 가능
	//void sample() {   		}; 이런게 일반 메서드
	default void sample2() { }	//default메서드는 사용 가능
	
	
	
	void sample();
	
	
	
}
