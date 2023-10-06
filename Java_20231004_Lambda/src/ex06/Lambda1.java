package ex06;

interface printable {
	void print(String msg);
}

class Printer implements printable {

	@Override
	public void print(String msg) {
		System.out.println(msg);

	}

}

public class Lambda1 {

	public static void main(String[] args) {

		Printer p = new Printer();
		p.print("msg print");
	}

	
	
}

