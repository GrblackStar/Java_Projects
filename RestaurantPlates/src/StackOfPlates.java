import java.util.Scanner;
import java.util.Stack;

public class StackOfPlates {

	public static void main(String[] args) {
		Stack <Integer> stack = new Stack<Integer>();

        Scanner s = new Scanner(System.in);
		
		System.out.print("Enter how many plates to be wash:  ");
		int washed = s.nextInt();
		washing(stack, washed);
		
		System.out.println("WARNING! The maximum plates to be served is:  " + washed);
		System.out.print("Enter how many plates to be served:  ");
		int served = s.nextInt();
		serving(stack, served, washed);
		
		System.out.println ("There are " + (washed-served) + " washed plates left");
		System.out.println ("There are " + stack.peek() + " washed plates left");
		
		
		s.close();
	}
	
	public static void washing(Stack <Integer> stack, int washed) {
		for (int i=1; i <= washed; i++) {
			stack.push(i);
			System.out.println ("Washed plate number:  " + i);
		}
	}
	
	public static void serving (Stack <Integer> stack, int served, int washed) {
		for (int i=served; i>=1; i--) {
			stack.pop();
			System.out.println ("Served plate number:  " + washed);
			washed--;
	    }
	}
}
