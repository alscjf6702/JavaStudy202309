package ex06_Interface;

public class SPrinter implements CSPrint{

	@Override
	public void print(String msg) {
		System.out.print("삼성프린터 흑백 출력 : ");
		System.out.println(msg);
	}

	@Override
	public void cprint(String msg) {
		System.out.print("삼성프린터 컬러 출력 : ");
		System.out.println(msg);
	}

	
	
}
