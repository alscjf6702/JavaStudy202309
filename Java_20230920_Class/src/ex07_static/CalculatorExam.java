package ex07_static;

public class CalculatorExam {
	public static void main(String[] args) {
	//객체 생성하여 인스턴스 변수 및 메서드 사용하여 출력
		Calculator c = new Calculator();
		c.add(5, 1);
		System.out.println(c.result);

		
		System.out.println("=========");
		
		//객체 생성 없이 static정적변수 및 정적 메서드 호출
		Calculator.sub(5, 3);
		System.out.println(Calculator.minus);
		
		//c.minus는 클래스변수인지 메서드변수인지 정확히 알 수 없기 때문에
		//이런거는 권장하지않음
		System.out.println(c.minus);
		
	}
}
		
