package ex03;

import java.util.Scanner;

public class TvTest {

	public static void main(String[] args) {

		Tv tv = new Tv();
		System.out.println(tv.channel);
		System.out.println(tv.color);
System.out.println("=====");
		System.out.println(tv.channel);
		Tv tv2 = new Tv("black",7, false);
		System.out.println(tv2.color + " " + tv2.channel + " " + tv2.power);

		Tv tv3 = new Tv(false, 1);
System.out.println("===");
		Tv tv4 = new Tv("Green");
		System.out.println(tv4.channel + " " + tv4.color);
		
		
	}
	
}
