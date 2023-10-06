package ex06;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Lambda6_1 {
//Consumer 는 인자 하나를 받고 아무것도 리턴하지 않습니다.
//	accept가 메서드에 있다. // accept 재정의 필요
	public static void main(String[] args) {

		Consumer<String> con = name -> System.out.println(name);
		
		con.accept("조조");
		
//		Consumer<String> con = new Consumer<String>() {
//			
//			@Override
//			public void accept(String name) {
//				System.out.println(name);
//			}
//			
//		};
//		
//		con.accept("조조");
	
//		BiConsumer는 인자(멤버변수)가 2개인 경우 사용
		BiConsumer<String, Integer> bicon = (name,age)->System.out.println(name + "=" + age);
		bicon.accept("조조", 20);
		
//		IntConsumer는 인자1개에 정수만 가능
		IntConsumer intcon = (age) -> System.out.println(age);
		intcon.accept(33);
		
	
	
	}

}
