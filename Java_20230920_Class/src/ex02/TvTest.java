package ex02;

import java.util.Scanner;

public class TvTest{

	public static void main(String[] args) {
		
		Tv tv = new Tv();	//객체 생성, 생성자 호출
		//객체가 생성되기 위해서는 반드시 생성자를 통해서 생성된다.
		//Tv클래스에 tv(){ } 기본 생성자를 생성하면 기본 생성자 안의 속성이나 기능이
		//객체 생성될 때 호출된다
		
		//주의할 점!
		//Tv() 객체를 생성할 때 내가 따로 매개변수를 넣어줬다면
		//기본 생성자를 자동으로 따로 만들어주지 않는다.
		
		
		
		Tv tv2 = new Tv(10);
		//생성자는 오버로딩이 가능
		//Tv클래스의 기본 생성자에 매개변수를 넣어주면
		//오버로딩이 가능(오버로딩: 메서드명이 같으나, 매개변수의 타입이나 개수가 다른 것)
		
		tv2.channelUp(10);
		System.out.println(tv2.channel);
		
		Tv tv3 = new Tv("Kor",10);
		
		
		
	}
	
}
