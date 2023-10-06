package hello;

import java.security.SecureRandom;

public class Java {
public static void main(String[] args) {
	
	Hello hi = Hello.getInstance();
	
	System.out.println(hi.app);
	
	SecureRandom scrRan = new SecureRandom();
	
	int[] scr = new int[6];
	boolean flag = false;
	

	while(!flag) {
	for(int i = 1 ; i< scr.length+1 ; i++) {
		scr[i] = scrRan.nextInt(44)+1;
		if(scr[i] == scr[i-1]) break;
		
		if(scr[i] != scr[i-1]) {
			flag = true;
			break;
		}
		
	}
	
	}
	for(int i = 1 ; i<scr.length+1 ; i++) {
	System.out.print(scr[i]+ " ");}
}
}
