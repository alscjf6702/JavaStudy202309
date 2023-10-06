package sixProblem;

public class SoundableExample {
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	
	
	public static void main(String[] args) {
//		printSound(new Cat());
//		printSound(new Dog());
	
		Soundable sori = new Cat();
		sori.sori();
		sori.sound();
		sori = new Dog();
		sori.sori();
		sori.sound();
		
	}
}
