
public class Exam02 {

	public static void main(String[] args) {
		// 아스키코드를 알파벳으로 변환하기
		int a = 78;
		System.out.printf("%c", a);
		System.out.printf("%c\n", 77);

		System.out.println("1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라");
		ex05();

		System.out.println("1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라");
		ex06();
	}

	public static void ex05() {
		for (int i = 2; i <= 30; i = i + 2) {
			if (i % 6 == 0) {
				System.out.println(" ");
			}
			System.out.print(i + " ");
		}
	}

	public static void ex06() {
		
	}

	


}