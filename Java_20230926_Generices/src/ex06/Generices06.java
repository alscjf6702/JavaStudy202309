package ex06;

class Box<T> {
   private T obj;

   public Box() {
   }

   public void set(T obj) {
      this.obj = obj;
   }

   public T get() {
      return this.obj;
   }
}

public class Generices06 {

   public static <T> Box<T> boxing(T t) {
      Box<T> box = new  Box<T>();
      box.set(t);
      return box;
   }

   public static void main(String[] args) {
      Box<Integer> box1 = boxing(100);
      int intValue = box1.get();
      System.out.println(intValue);

      Box<String> box2 = boxing("홍길동");
      String strValue = box2.get();
      System.out.println(strValue);
   }
}