package tset;

public class Main {
	   public static void main(String[] args) {
	      Animal a = new Dog();
	      a.Sound();
	      
	      Dog d = (Dog) a;
	      a.eat();
	      d.eat();
	      d.똥개();
	      d.Sound();
	      System.out.println("=========================");
	      
	      Animal b = new Cat();
	      Cat c = (Cat) b;
	      c.똥고양이();
	      
	      Dog g = new Dog();
	      g.eat();
	      g.똥개();
	      g.Sound();
	      
	   }
	   
	   
	}