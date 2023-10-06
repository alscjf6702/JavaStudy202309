package ex03;

class Counter{
	int count = 0;
	//synchronized  =>  다중 스레드 환경에서 공유 데이터나 리소스에 대한 동시 접근을 제어하는 데 사용
	synchronized public void increment() {count++;}
	synchronized public void decrement() {count--;}
	
	public int getCount() { return count;}
}

public class CurrentThreadName4 {

	public static Counter cnt = new Counter();

	public static void main(String[] args) throws InterruptedException {

		Runnable task1 = () -> {
			for (int i = 0; i < 1000; i++) {
				cnt.increment();
			}
		};

		Runnable task2 = () -> {
			for (int i = 0; i < 1000; i++) {
				cnt.decrement();
			}
		};

		Thread t1 = new Thread(task1, "MyThread");
		Thread t2 = new Thread(task2, "MyThread");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("count : " + cnt.getCount());
	}
}
