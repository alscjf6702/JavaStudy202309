package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FirstStreamExam {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		
		IntStream stm1 = Arrays.stream(ar);
		IntStream stm2 = stm1.filter(n->n%2==1);	//중간 연산 (filter로 걸러준다)
		
		int sum = stm2.sum();	//최종 연산 (sum메서드를 사용 stm2에서 걸러준 것을 더해준다)
		
		System.out.println(sum);
		
		
		//============= 위의것을 한줄로 적어준다.
		int result = Arrays.stream(ar).filter(n->n%2==0).sum();
		
		System.out.println(result);

		System.out.println("===========================================");
		
		String[] names = {"Toy","BBB","Robot","CCCC","Box","AAA"};
		Arrays.stream(names).filter(x->x.length()>3)
		.filter(x->x.contains("ob"))
		.filter(x->x.length()%2==1)
		.forEach(x->System.out.println(x));
		
		
		System.out.println("==============================================");
		Arrays.stream(names)	
		.map(s->s.length())
		.forEach(s->System.out.println(s));
		
		System.out.println("==============================================");
		int sum2 = Arrays.stream(names).mapToInt(x->x.length()).sum();
		System.out.println(sum2);
		
		System.out.println("==============================================");
		List<String> str = Arrays.asList("Toy","BBB","Robot","CCCC","Box","AAA");
		
		int sum3 = str.stream().mapToInt(x->x.length()).sum();
		System.out.println(sum3);

		
		
		
		
//===========================================================================================		
//		int count = (int) stm2.count();	//count메서드는 smt2에 있는 갯수를 세어준다.
//		
//		System.out.println(count);
		
		
	}
	
}
