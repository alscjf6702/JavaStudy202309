package ex06;

interface Printable3 {
	void print(String msg);
}

public class Lambda3 {

	public static void main(String[] args) {

		Printable3 p =(msg)->System.out.println(msg);
				
		p.print("msg print3");
	}

}
