package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceExam {
   public static void main(String[] args) {

      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); // 정수형 리스트(numbers)를 생성, 초기값 1,2,3,4,5
      Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
      // 정수형 리스트를 스트림으로 변환.스트림의 요소를 하나로 줄이는 연산. 첫번째 매개변수 0은 초기값, 람다
      // 0+1=1 +2=3 +3=6 +4=10 +5=15
      System.out.println("sum : " + sum);

      System.out.println("--------------------------------");

      List<String> str = Arrays.asList("a", "bb", "ccc", "dddd", "eeeee");
      Integer totalL = str.stream().map(s -> s.length()).reduce(0, (a, b) -> a + b);
      // 문자열 리스트를 스트림으로 변환.map다른 문자열 길이로 변환. 스트림의 요소를 하나로 줄이는 연산. 첫번째 매개변수 0은 초기값, 람다
      System.out.println(totalL);

      System.out.println("--------------------------------");

      List<Integer> num = new ArrayList<Integer>();
      for (int i = 0; i < 10; i++) {
         num.add((int)(Math.random()* 100));
      }
      
      for(int i : num)
    	  System.out.print(i + " ");
      System.out.println();
      
      int max = num.stream().reduce(Integer.MIN_VALUE, (a, b) -> Integer.max(a, b));
      
      System.out.println("max : " + max);
      
      
      System.out.println("====================");
      List<String> word = Arrays.asList("Hello" , " " , "World" , "!");
      
      String combind = word.stream().reduce("" , (a,b) -> a+b);
      System.out.println(combind);
      
      
      
      
      
      
      
      
      
      
      
      
      

   }
}