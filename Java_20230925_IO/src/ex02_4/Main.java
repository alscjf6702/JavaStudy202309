package ex02_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String wonSymbol = "\u20A9";
		Scanner scan = new Scanner(System.in);
		System.out.print("색, 종이크기, 개수를 차례대로 입력하세요");
		String input = scan.nextLine();
		scan.close();

		String[] arr = input.split(" ");
		String colorType = arr[0].toLowerCase();
		String paperSize = arr[1].toLowerCase();
		int count = Integer.parseInt(arr[2]);

		int totalCost = computePrintJobCost(colorType, paperSize, count);
		totalCost = roundUptoNearestTen(totalCost);

		System.out.println("총 가격은  : " + totalCost + wonSymbol);

	}



	public static int computePrintJobCost(String colorType, String paperSize, int count) {

		int colorCost;
		int paperCost;

		switch (colorType.toLowerCase()) {
		case "color":
			colorCost = 15;
			break;
		case "grayScale":
			colorCost = 5;
			break;
		default:
			colorCost = 0;
			break;

		}

		switch (paperSize.toLowerCase()) {
		case "a4":
			paperCost = 40;
			break;
		case "a5":
			paperCost = 20;
			break;
		case "letter":
			paperCost = 30;
			break;
		case "legal":
			paperCost = 25;
			break;
		default:
			paperCost = 0;
			break;

		}
		
		int totalCost = (paperCost + colorCost) * count;
		return totalCost;
	}
	public static int roundUptoNearestTen(int cost) {
		if (cost % 10 != 0) {
			cost+= (10 - (cost %10));
		}
		
		return cost;
	}
	
}
