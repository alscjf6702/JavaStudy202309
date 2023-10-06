package ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample3 {
	public static void main(String[] args) {

		try {
			Writer writer = new FileWriter("c:/data/test3.txt");

			char a = 'A'; // 한 문자씩 출력
			writer.write(a);
			char b = 'B';
			writer.write(b);
			char c = 'C';
			writer.write(c);

			char[] arr = { 'D', 'E', 'F', 'D' }; // 배열 출력
			writer.write(arr);

			String str = "HIJ"; // 문자열 저장
			writer.write(str);

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}
	

}
