package ex05;

import java.util.Scanner;

public class TvTest{

	public static void main(String[] args) {
		
		Tv tv = new Tv(10);

		System.out.println(tv.channel);
		
		Tv tv2 = new Tv("black", false, 7, 13);
		System.out.println(tv2.color + " " + tv2.channel +" " + tv2.power);
	
		Tv tv3 = new Tv(14);
		System.out.println(tv3.channel + tv3.color + tv3.power);
	
		Tv tv4 = new Tv("Blue");
		System.out.println(tv4.channel+tv4.color+tv4.power);
		
		Tv tv5 = new Tv(40,12);
		System.out.println(tv5.channel+tv5.color+tv5.volume);
	}
	
}
