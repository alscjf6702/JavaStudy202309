package ex06_Interface;

public class LPrinter implements Printable{

	@Override
	public void print(String msg) {
		System.out.print("Lg프린터 흑백 출력 : ");
		System.out.println(msg);
	}

	
	
}
