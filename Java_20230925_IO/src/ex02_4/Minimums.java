package ex02_4;

import java.util.Scanner;

public class Minimums {

	   public static void main(String[] args) {
	        // 샘플 입력 및 테스트
	        
	        Scanner scan = new Scanner(System.in);
	        System.out.println("4가지 숫자를 차례대로 입력하세요");
	        
	        int num1 = scan.nextInt();
	        int num2 = scan.nextInt();
	        int num3 = scan.nextInt();
	        int num4 = scan.nextInt();
	        
	        int result = min4(num1,num2,num3,num4);
	     
	        System.out.println("이 중 가장 작은 수는: " + result);
	        scan.close();
	    }

	    public static int min4(int num1, int num2, int num3, int num4) {
	        // 두 숫자를 비교하는 함수 호출을 사용하여 가장 작은 숫자를 찾습니다.
	        int min1_2 = min(num1, num2);
	        int min3_4 = min(num3, num4);
	        int result = min(min1_2, min3_4);
	        return result;
	    }

	    // 두 숫자 중 작은 숫자를 반환하는 함수
	    public static int min(int a, int b) {
	        return a < b ? a : b;
	    }
}
