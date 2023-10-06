package ex04;

public class Lotto {


	   public static void main(String[] args) {
	      
	      int[] number = new int[6];
	      int selectedNumber = 0;
	      
	      for(int i = 0; i < number.length ; i++) {
	         char selectedNumFlag = 'N';
	         selectedNumber = (int)(Math.random() * 45) + 1; // 1~45 사이의 난수
	         System.out.println(selectedNumber);
	         for(int j = 0; j <= i ; j++ ) {
	            if (selectedNumber == number[j] ) {
	               i--;
	               selectedNumFlag = 'Y';
	               break;
	            } 
	         }
	         if(selectedNumFlag == 'N') {
	            number[i] = selectedNumber;
	         }
	      }

	      // 오름차순 sort 방식
	      System.out.println("=================================");
	      int temp = 0;
	      for (int i = 0; i < number.length ; i++) {
	         for(int j = i  ; j < number.length -1 ; j++) {
	            if( number[i] > number[j+1]) {
	               temp = number[i];
	               number[i] = number[j+1];
	               number[j+1] = temp;
	            }
	         }
	      }
	      System.out.println("선택 번호 : ");
	      for(int i = 0; i < number.length; i++) {
	         System.out.print(number[i] + "   ");
	         
	      }
	   }

	}