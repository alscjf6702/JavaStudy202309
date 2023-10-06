package ex04;

public class Exam15 {

	
	public static void main(String[] args) {
		for(int i = 1 ; i <= 9 ; i++) {
			for(int j = 1; j <= 9; j++) {
				
				int x = j+(i-1)/9*9;
				int y = i%9 == 0 ? 9: i%9;
				
				if(x>9)
					break;
				System.out.print(x+ " * " + y + " = " + x*y +"\t");
			}
			System.out.println();
			if(i%9==0)
				System.out.println();
		}
	}
}
