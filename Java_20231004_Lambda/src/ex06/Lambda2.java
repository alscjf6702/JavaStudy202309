package ex06;

interface Printable2 {
	void print(String msg);
}

public class Lambda2 {

	public static void main(String[] args) {

		Printable2 p = new Printable2() {

			@Override
			public void print(String msg) {
				System.out.println(msg);
			}
		};
		p.print("msg print2");
	}

}
