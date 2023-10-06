package ex06;

import java.util.function.Consumer;
import java.util.function.Supplier;

//@FunctionalInterface
//interface Car2{
//	int roll();
//}

public class Lambda8_1 {

	public static void main(String[] args) {

//		Car car = () ->(int)(Math.random()*6)+1;
//
//		int result = car.roll();
//		System.out.println(result);
		
		Consumer<Integer> con = (x) -> System.out.println((int)(Math.random()*x)+1);	
		con.accept(45);
		
		//Supplier<Integer>는 아무런 인자를 받지 않아서 ()->T 로 표현되어 Bi가 못 붙는다.
		Supplier<Integer> s1 = ()-> (int)(Math.random()*6)+1;
		System.out.println(s1.get());

		
	}

}
