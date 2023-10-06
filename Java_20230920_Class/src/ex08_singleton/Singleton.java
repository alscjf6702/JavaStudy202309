package ex08_singleton;

public class Singleton {
	
	   static Singleton singleton = new Singleton();
	   
	   int apple = 100;

	   private Singleton() {
	   }

	   //static이 있어서 객체를 생성하지않고도 전달 가능
	   public static Singleton getInstance() {
	      return singleton;
	   }

	}