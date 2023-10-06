package ex04;

public class Exam16 {
	public static void main(String[] args) {
		
		int score = 100;
		
		String result = score>100 ? "0~100의 점수를 입력하세요": score>=90 ? 
				"A" : score>=80 ? "B" : score>=70 ? "C" : score>=60 ? "D" :"F";
		
		System.out.println(result);
		
	}
}
