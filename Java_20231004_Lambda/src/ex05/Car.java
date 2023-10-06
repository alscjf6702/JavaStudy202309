package ex05;

public class Car {

	private Tire tire1 = new Tire();

	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명의 타이어가 굴러감..");

		};
	};

	public void run1() {
		tire1.roll();
		tire2.roll();
	}

	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 객체2 타이어 굴러감..");
			}
		};
		tire.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
	}
	
	public void run4(Tire tire) {
		tire.roll();
	}

}
