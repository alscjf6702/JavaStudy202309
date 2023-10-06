package ex06;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

//@FunctionalInterface
//interface Square2 {
//	int square(int x);
//	
//}

public class Lambda7_1 {

	public static void main(String[] args) {

//		IntConsumer intCon = x-> System.out.println(x*x);		
//		Square s = x -> x * x;
		
//		int result = s.square(3);
//		intCon.accept(result);
//		System.out.println(result);
		
		//Cousumer은 .accept , Function은 sysout(.apply)로 출력
		
		//Consumer<Intger> => 1개의 정수형 인자
		Consumer<Integer> con1 = x -> System.out.println(x*x);
		con1.accept(4);
		
		//Consumer<String> => 1개의 문자열 인자
		Consumer<String> con2= x -> System.out.println(x+" "+x);
		con2.accept("go");
		
		//BiConsumer<String, Integer> => 1개의 문자열, 1개의 정수형 인자
		BiConsumer<String , Integer> biCon1 = (x,y) -> System.out.println(x+ " "+y);  
		biCon1.accept("하이", 33);
		
		//Fucntion<intger,Integer> => 2개의 인자
		Function<Integer, Integer> f1 = x -> x*x;
		System.out.println(f1.apply(5));
		
		//Bifunction<Integer,Integer,Double>  => 2개의 정수 매개변수에 결과값이 실수
		BiFunction<Integer,Integer,Double> bif1 = (x,y) -> (x+y)*1.0;
		System.out.println(bif1.apply(3, 33));

		//Bifunction<Integer,Integer,String>  => 2개의 정수 매개변수에 결과값이 문자열
		BiFunction<Integer,Integer,String> bif2 = (x,y) -> (x-y)+"";
		System.out.println(bif2.apply(3, 33));
		
		//Bifunction<Integer,Integer,Integer>  => 2개의 정수 매개변수에 결과값이 정수
		BiFunction<Integer,Integer,Integer> bif3 = (x,y) -> (x*y);
		System.out.println(bif3.apply(3, 33));
		
		//Bifunction<String, String ,String>  => 2개의 정수 매개변수에 결과값이 정수
		BiFunction<String, String ,String> bif4 = (x,y) -> (x+y);
		System.out.println(bif4.apply("Hello ", "Java"));
		
//		BiFunction<T,U,R>
//		T , U = 매개변수 , R = Return값
		
		//Lambda식
		Function<String, Integer> f3 = (String s) -> Integer.parseInt(s);
		int result = f3.apply("100");
		System.out.println(result);
		
		//메서드 참조( 정적메서드 Interger클래스::메서드) 
		Function<String, Integer> f4 = Integer::parseInt;
		result = f4.apply("100");
		System.out.println(result);
		
		
		
	}

}
