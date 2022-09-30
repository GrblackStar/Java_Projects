package upr_8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(3);
		stack.push(5);
		//System.out.println(stack.peek());
		System.out.println(stack.pop());
		//System.out.println(stack.peek());
		System.out.println(stack.pop());
		//System.out.println(stack.peek());
		System.out.println(stack.pop());

		System.out.println();
		
		Deque<Integer> queue = new ArrayDeque<>();
		//Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(1);
		queue.offer(3);
		queue.offer(5);
		//System.out.println(queue.peek());
		System.out.println(queue.poll());
		//System.out.println(queue.peek());
		System.out.println(queue.poll());
		//System.out.println(queue.peek());
		System.out.println(queue.poll());
	}

}
