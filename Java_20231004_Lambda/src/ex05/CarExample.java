package ex05;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		car.run1();
		car.run2();
		
		car.run3(new Tire()// 익명 하위클래스 객체 생성
		{
			@Override
			public void roll() {
				System.out.println("익명 객체3이 굴러감..");
			}
		});
		
		car.run4(new Hawi() {
			@Override
			public void roll() {
				System.out.println("하위클래스 타이어");
			}
		});
		
	}
}
