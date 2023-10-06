package ex04;

public class Exam07 {

	public static void main(String[] args) {
		
		int sum = 0 ;	
		int i = 0;
		
		while( i < 10) {
			i++;
			
			if(i%2 == 0)
			  continue;
			
			sum += i;
			System.out.println(i);
		}
		
		System.out.println(" = sum : "  + sum);
	}
	
}
