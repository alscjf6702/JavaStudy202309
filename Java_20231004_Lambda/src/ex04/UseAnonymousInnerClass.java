package ex04;

interface Printable {
	void print();
}

class Papers {
	private String con;

	public Papers(String con) {
		this.con = con;
	}

	public Printable getPrinter() {

		return new Printable() {

			@Override	//익명클래스, 클래스 없이 이너클래스를 만든다.
			public void print() {
				System.out.println(con);
			}
		};

	}
}

public class UseAnonymousInnerClass {
	public static void main(String[] args) {
		Papers p = new Papers("프린터로 메시지를 출력합니다");

		Printable prn = p.getPrinter();
		prn.print();

	}
}
