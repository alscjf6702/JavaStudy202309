package ex01;

import java.util.Scanner;

public class TvTest{

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		
		tv.channel = 8;
		tv.channelDown();
		
		System.out.println(tv.channel);
		
		
		Tv tv2 = new Tv();
		
		System.out.println(tv2.channel);
		
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelUp();

		System.out.println(tv2.channel);
		
		Tv tv3;
		tv3 = tv;
		
		System.out.println(tv3.channel);
	
		tv3.channel = 100;
		System.out.println(tv.channel);
		System.out.println(tv3.channel);
		
		
//		System.out.println("===========boolean테스트==========");
//		
//		boolean power = false;
//		System.out.println("전원을 끄려면 5번을 누르세요.");
//		
//		while(!power) {
//			System.out.println("채널을 입력하세요");
//			Scanner scan = new Scanner(System.in);
//			int a = scan.nextInt();
//			
//			switch (a) {
//			case 1: 
//				System.out.println("OCN");
//				break;
//			case 2:
//				System.out.println("EBS");
//				break;
//			case 3:
//				System.out.println("KBS");
//				break;
//			case 4:
//				System.out.println("SBS");
//				break;
//			case 5:
//				System.out.println("종료");
//				power = true;
//				break;
//			}
//		}
		
		
	}
	
}
