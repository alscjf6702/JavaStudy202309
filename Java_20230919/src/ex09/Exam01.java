package ex09;

public class Exam01 {

	public static void main(String[] args) {
		int[] numA = new int[10];
		int[] numB = new int[10];
		int count = 0;
		int k = 0;
		for (int i = 0; i < numA.length; i++) {
			numA[i] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < numA.length; i++) {
			System.out.print(numA[i] + " ");
		}
		System.out.println(" ");
//		for(int i = 0 ; i<numA.length; i++){
//			numB[numA[i]]++;
//		}
//		
//		for(int i = 0; i<numA.length; i++) {
//			System.out.printf("%d의 개수 : %d\n",i,numB[i]);
//		}
//		

		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;

		for (int i = 0; i < numA.length; i++) {
			if (numA[i] == 0) {
				zero += 1;
			}

			if (numA[i] == 1) {
				one += 1;
			}
			if (numA[i] == 2) {
				two += 1;

			}
			if (numA[i] == 3) {
				three += 1;

			}
			if (numA[i] == 4) {
				four += 1;

			}
			if (numA[i] == 5) {
				five += 1;

			}
			if (numA[i] == 6) {
				six += 1;

			}
			if (numA[i] == 7) {
				seven += 1;

			}
			if (numA[i] == 8) {
				eight += 1;

			}
			if (numA[i] == 9) {
				nine += 1;

			}
		}
			System.out.printf(
					"\n0의 개수 : %d\n1의 개수 : %d\n2의 개수 : %d\n3의 개수 : %d\n4의 개수 : %d\n5의 개수 : %d\n6의 개수 : %d\n"
							+ "7의 개수 : %d\n8의 개수 : %d\n9의 개수 : %d\n",
					zero, one, two, three, four, five, six, seven, eight, nine);

		
	}
}