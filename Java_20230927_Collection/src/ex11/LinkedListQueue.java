package ex11;

import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

public class LinkedListQueue{

	public static void main(String[] args) {

//		Queue<String> queue = new LinkedList<String>();
//		Queue<String> queue = new ArrayDeque<String>();
		Queue<String> queue = new LinkedTransferQueue<String>();
		
		queue.add("Toy2");		//데이터 추가 시 offer도 가능하지만 add도 가능
		queue.offer("Box2");
		queue.offer("Robot2");
		queue.offer("Toy2");
		
		System.out.println("====poll()==== 맨 앞의 데이터를 뺀다.");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println("");
		
		for(String s : queue) {
			System.out.println(s);
		}
		
		System.out.println(queue);
		
		System.out.println("====peek()==== 맨 앞에 뭐가 있는지 확인");
		System.out.println(queue.peek());
		
		System.out.println("=> peek()를 쓰면 다음 poll()을 썼을때 어떤게 빠질지 알 수 있다.");
		System.out.println("");
		System.out.println("");
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		System.out.println(queue);
		System.out.println(queue.isEmpty());
		queue.offer("d");
		System.out.println(queue);
		for(String s : queue) {
			System.out.println(s);
		}
		
	}
}