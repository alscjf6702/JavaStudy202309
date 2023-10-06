package ex06;

import java.util.function.Function;
import java.util.function.Supplier;

public class Lambda9_1 {

	public static void main(String[] args) {
		
		System.out.println("====Supplier<Integer>로 Lambda식 계산 ====");

		int[] arr = {1,2,3,4,5,6,7,8,9,90,11};

		Supplier<Integer> s1 = () -> {int sum = 0; for (int i : arr) sum += i; return sum;};
		
		System.out.println(s1.get());
		
System.out.println("====Function 객체 생성 후 배열 계산====");
		
		Function<Integer[], Integer> f1 = new Function<Integer[], Integer>() {
			
			@Override
			public Integer apply(Integer[] arr) {
				int sum = 0 ; 
				for(int i : arr) sum +=i;
				return sum;
			}
		};
		
		int result = f1.apply(new Integer[] {1,2,3,4,5});
		System.out.println(result);
		
System.out.println("====Function<Integer[], Integer> Lambda식으로 계산====");
		
		Function<Integer[], Integer> f2 = arr2 -> {
				int sum = 0 ; 
				for(int i : arr) sum +=i;
				return sum;
			
		};
		
		int result2 = f1.apply(new Integer[] {1,2,3,4,5});
		System.out.println(result2);
		
		
	}

}
