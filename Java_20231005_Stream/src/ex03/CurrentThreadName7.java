package ex03;

class Printer {
	private boolean isHelloTurn = true;

	synchronized public void printHello() {
		while (!isHelloTurn) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Hello");
		isHelloTurn = false;
		notify();
	}

	synchronized public void printWorld() {
		while (isHelloTurn) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("World");
		isHelloTurn = true;
		notify();
	}
}
//isHelloTurn을 열쇠로 사용해서 World가 동시에 실행 되는게 아니라 Hello가 실행되고 나가면 World가 실행됨 

public class CurrentThreadName7 {

	public static void main(String[] args) throws InterruptedException {
		Printer printer = new Printer();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				printer.printHello();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				printer.printWorld();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}
}
