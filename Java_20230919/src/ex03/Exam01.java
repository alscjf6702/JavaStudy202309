package ex03;

public class Exam01 {

	public static void main(String[] args) {
		
		int[] myArr = new int[5];
		String[] str = new String[3];
		str[0] = "Hello";
		
		int[] myArr2 = {10,20,30,40,50};
		
		String[] str2 = {"Hi","dd","asd"};
		
		for(int i = 0 ; i < myArr.length ; i++) {
			int num = (int)(Math.random()*100)+1;
			myArr[i]= num;
		}
		
		for(int i = 0 ; i< myArr.length; i++) {
			System.out.println(myArr[i]);
		}
		
		for(int i = 0 ; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		for(int i=0; i<str2.length; i++) {
			System.out.println(str2[i]);
		}
		
		
	}
}
