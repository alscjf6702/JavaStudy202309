package ex06;

import java.util.function.Consumer;

@FunctionalInterface
interface Car{
	int roll();
}

public class Lambda8 {

	public static void main(String[] args) {

		Car car = () ->(int)(Math.random()*6);

		int result = car.roll();
		System.out.println(result);
		
	
		
	}

}
