package ex06;

@FunctionalInterface
interface Print {
	void printVar(String name, int i);
	
}

public class Lambda6 {

	public static void main(String[] args) {

		Print p = (name , i) -> System.out.println(name + " = " + i); 

		p.printVar("김민철", 33);
		

	}

}
