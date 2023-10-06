package ex07;

public class MethodReferenceExam {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.action(new Calcuable() {
			
			@Override
			public double calc(double x, double y) {
				return x+y;
			}
		});
		
		person.action((x, y)-> x+y);
		
		System.out.println("=====");
		person.action((x,y)->Computer.staticMethod(x, y));
	
		System.out.println("=====");		
		person.action(Double::sum);
		
		System.out.println("=====");
		
		Computer com = new Computer();
		person.action(new Calcuable() {
			@Override
			public double calc(double x, double y) {
				return Computer.staticMethod(x, y);
			}
		});
		person.action((x,y)->Computer.staticMethod(x, y));
		//위에꺼 Lambda식
		
		//Lambda 축약식
		person.action(Computer::staticMethod);
		//정적 메서드(클래스 :: 메서드);
		person.action(com::instanceMethod);
		//인스턴스 메서드(참조변수 :: 메서드);
		
	
	
}
}
