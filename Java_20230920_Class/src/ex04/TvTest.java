package ex04;

import java.util.Scanner;

public class TvTest{

	public static void main(String[] args) {
		
		Tv tv = new Tv(10);

		System.out.println(tv.channel);
		
		Tv tv2 = new Tv("black", false, 7);
		System.out.println(tv2.color + " " + tv2.channel +" " + tv2.power);
		
	
	}
	
}
