package ex06_static;

public class CalculatorExam {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(10, 20);
		System.out.println(cal.result);
		cal.minus = 123;
		System.out.println(cal.minus);
		
		Calculator cal2 = new Calculator();
		cal2.add(100, 200);
		System.out.println(cal2.result);
		System.out.println(cal2.minus);
		
		cal.sub(10, 5);
		System.out.println(cal.minus);
		
		Calculator.sub(50, 10);
		System.out.println(Calculator.minus);
		
		//static devide는 메서드영역(static영역)에 저장되기때문에
		//Calculator든 cal이든 cal2든 Calculator클래스를 호출하면
		//다 같이 공유해서 사용할 수 있고, devide에 저장되어진 데이터도 
		//다 같이 공유 받는다.
		Calculator.devide(26, 2);
		System.out.println(Calculator.devide);
		System.out.println(cal.devide);
		System.out.println(cal2.devide);
	}
}
		
