package ex04;

import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i = 0 ; i<a ; i++) {
			for(int j = 0 ; j<i ; j++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j <(2*a)-1-(i*2); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		int b = scan.nextInt();
		for(int p = b ; p >=1 ; p--) {
			
			for(int k = 0 ; k<b-p; k++) {
				System.out.print(" ");
			}
	
			for(int k = 1 ; k <= 2*p-1; k++) {
				System.out.print("*");
				
			}System.out.println("");
		}
	}
}
