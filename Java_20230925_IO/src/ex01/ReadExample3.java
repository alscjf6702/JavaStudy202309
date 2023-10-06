package ex01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample3 {

	public static void main(String[] args) throws IOException {
		//1byte씩 가져오는 방법
//		Reader reader = new FileReader("C:/data/test3.txt");
//		while (true) {
//			int read = reader.read();
//			if (read == -1)
//				break;
//			System.out.print((char) read + " ");
//		}
//		reader.close();
//		System.out.println();
//		System.out.println("+++++++++++++++++++++++++");
		//배열로 100byte씩 읽어오는 방법
		Reader reader = new FileReader("C:/data/test4.txt");
		char[] data = new char[100];

		while (true) {
			int num = reader.read(data);
			if (num == -1)
				break;

			for (int i = 0; i < num; i++)
				System.out.print(data[i]);

		}
		
		reader.close();
	}
}
