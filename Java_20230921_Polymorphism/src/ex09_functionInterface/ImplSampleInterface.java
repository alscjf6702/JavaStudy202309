package ex09_functionInterface;

public class ImplSampleInterface implements SampleInterface {

	@Override
	public void sample() {
		System.out.println("인터페이스에 추상메서드로 넣어준애는 구현하는 클래스에서 무조건 구현해야함");
	}
	
	public void sample2() {
		System.out.println("인터페이스에 default로 메서드 작성해준 애는 구현하는 클래스에서 작성해주면 구현되지만 안구현해도 됨");
	}

}
