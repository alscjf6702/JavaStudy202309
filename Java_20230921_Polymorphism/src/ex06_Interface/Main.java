package ex06_Interface;

public class Main {

	public static void main(String[] args) {
		
		Printable prn = new LPrinter();
		String msg = "Hello World!";
		prn.print(msg);
		
		prn = new SPrinter();
		prn.print(msg);
		
		CSPrint p = new SPrinter();
		p.cprint(msg);
		p.print(msg);
		
		Printable p2 = new SPrinter();
		p2.print(msg);
	
		
	}
	
}
