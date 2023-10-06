package ex04;

public class Exam13 {

	public static void main(String[] args) {

		//두개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든경우의 수를 구하라

		for (int dice1 = 1; dice1 <= 6; dice1++) {
			for (int dice2 = 1; dice2 <= 6; dice2++) {
				if(dice1 + dice2 ==6) {
					System.out.println("두 개의 주사위를 던졌을 때 합이 6이 되는 수 : " + dice1 + " + " + dice2 + " = 6");
				}
			}
		}




	}
}
