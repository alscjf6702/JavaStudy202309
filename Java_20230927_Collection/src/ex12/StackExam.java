package ex12;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(11);
		stack.push(9);
		stack.push(10);
		stack.push(15);

		//pop은 빼는건데, stack의 경우에는 선입후출이다. 맨 뒤에서부터 빠진다.
		stack.pop();
		stack.pop();
		System.out.println("------------");
		for (int i : stack)
			System.out.println(i);
		
		
		
	}

}