package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("C:/data/test1.db");
			
			while(true) {
				int data = is.read(); //1byte씩 읽어온다.
				//읽어올 데이터가 다 떨어지면 -1을 값으로 저장한다.
				if(data == -1) break;//데이터가 떨어져 -1값이 저장되면 while 종료
				
				System.out.println(data);
			}
			 is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}
		System.out.println("프로그램 종료!");
	}
	
}
