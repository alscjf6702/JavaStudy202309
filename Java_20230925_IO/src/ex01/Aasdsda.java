package ex01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Aasdsda {

	public static void main(String[] args) {
		
		File file = new File("C:/data/test51.txt");
	
		try {
			boolean ss  = file.createNewFile();
			
			if(ss) {
				System.out.println("파일 생성 성공");
			}else{
				System.out.println("파일 생성 실패");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			Writer writer = new FileWriter("C:/data/test51.txt");
		
			char a = 'a';
			writer.write(a);
		
		} catch (IOException e) {

			e.printStackTrace();
		}
		
			
		
	}
	
}
