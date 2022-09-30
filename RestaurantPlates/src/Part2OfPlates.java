import java.util.Scanner;
import java.util.Stack;
import java.util.NoSuchElementException;

public class Part2OfPlates {
	public static void main(String[] args) {
		Stack <Integer> stack = new Stack<Integer>();
		Stack <Integer> stackNew = new Stack<Integer>();

        Scanner s = new Scanner(System.in);
		
		System.out.print("Enter how many plates to be wash:  ");
		int washed = s.nextInt();
		washing(stack, washed, s);
		System.out.println ("diameters:  " + stack);
		
		
		try {
		serving(stack, stackNew, s);
		}
		catch(NoSuchElementException e) {
			System.out.println("can't find elements");
		}
		
		System.out.println ("remaining:  " + stackNew);
    	System.out.println ("There are " + stackNew.size() + " washed plates left");
		
		
		s.close();
	}
	
	public static void washing(Stack <Integer> stack, int washed, Scanner s) {
		int diameter;
		for (int i=1; i <= washed; i++) {
			System.out.print("enter diameter: ");
			diameter = s.nextInt();
			stack.push(diameter);
		}
		System.out.println ("Washed plates:  " + washed);

	}

	
	public static void serving (Stack <Integer> stack, Stack <Integer> stackNew, Scanner s) {
		System.out.print("Enter the diameter of the plates you wish to be served:  ");
		int diameter = s.nextInt();
		int d;
		if (!stack.contains(diameter)) {
			System.out.println("invalid diameter");
		}
		while(true) {
		    d = stack.pop();
		    if(d != diameter) {
		        stackNew.push(d);
		    }
		    if (stack.isEmpty())
		    	break;
		}
	} 
	
}


