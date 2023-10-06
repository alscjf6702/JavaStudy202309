package tset;

class Animal {
	   void Sound() {
	      System.out.println("동물 소리를 내고 있습니다.");
	   }
	   
	   void eat() {
	      System.out.println("먹다");
	   }
	}

	//======================

	class Dog extends Animal {
	   
	   void Sound() {
	      System.out.println("멍멍!");
	   }

	   void 똥개() {
	      System.out.println("똥개");
	   }
	}

	//======================

	class Cat extends Animal {
	   
	   void Sound() {
	      System.out.println("야옹!");
	   }

	   void 똥고양이() {
	      System.out.println("고양이");
	   }
	}
