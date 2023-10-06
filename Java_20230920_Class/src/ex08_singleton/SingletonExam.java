package ex08_singleton;

import java.sql.DriverManager;

public class SingletonExam {

	public static void main(String[] args) {
		
		Singleton s= Singleton.getInstance();
		
		System.out.println(s.apple);
		
		
		//Singleton = 객체를 하나만 만들어서 다 같이 공유해서 쓰겠다.
		//static을 통해 모두와 같이 공유한다.
	}
	
	
	
}
