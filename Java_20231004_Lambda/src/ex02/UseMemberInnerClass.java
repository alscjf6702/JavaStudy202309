package ex02;

interface Printable{
	void print();
}

class Papers{
	private String con;
	public Papers(String con) {this.con= con;}
	public Printable getPrinter() {
		return new Printer();
	}
	
	private class Printer implements Printable{

		@Override
		public void print() {
			System.out.println(con);
		}
	}
}

public class UseMemberInnerClass {
	public static void main(String[] args) {
		Papers p = new Papers("프린터로 메시지를 출력합니다");
		
		Printable prn = p.getPrinter();
		prn.print();
		
		
	}
}
