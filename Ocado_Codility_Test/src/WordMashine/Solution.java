package WordMashine;

import java.util.Stack;

public class Solution {

	public int solution(String S) {
		String[] inputString = S.split(" ");
		Stack<Integer> stack = new Stack<>();

		// the method will return -1 if there is an error

		for (String current : inputString) {

			try {
				int top = Integer.parseInt(current);
				// checking if the number we have extracted is less than 2^20-1 -> 1048575
                // if it's not within the range, it returns na error
				if (top < 0 || top > 1048575) {
					return -1;
				}else{
                    // otherwise it fills in the stack -> pushes the values
                    stack.push(top);
                }
				

			} catch (NumberFormatException e) {
				switch (current) {
				
				case "+": 
					if (stack.size() == 1 || stack.isEmpty()) {
						return -1;
					} else {
					//getting the top elements and then removing them from the stack:
					int number1 = stack.peek();
					stack.pop();
					
					int number2 = stack.peek();
					stack.pop();
					
					int sum = number1 + number2;
					int max = 1048575;

					if (sum > max) {
						return -1;
					} else {
						stack.push(sum);
					} 
					}
					break;
				
					
					
				case "-": 
					if (stack.size() == 1 || stack.isEmpty()) {
						return -1;
					} else {
					//getting the top elements and then removing them from the stack:
					int num1 = stack.peek();
					stack.pop();
					
					int num2 = stack.peek();
					stack.pop();
					
					int substraction = num1 - num2;
					if (substraction < 0) {
						return -1;
					} else {
						stack.push(substraction);
					}
					}
					break;
					
					
				
				case "POP":
					if (stack.isEmpty()) {
						return -1;
					}
					stack.pop();
					break;
					
					
					

				case "DUP":
					if (stack.isEmpty()) {
						return -1;
					}
					int number = stack.peek();
					stack.push(number);
					break;

				
					
				default:
					return -1;
				}
			}

		}
		if (stack.isEmpty()) {
			return -1;
		}
		
		
		// returning the new string
		return stack.peek();
	}

	
	
	
	
	public static void main(String[] args) {

	}

}
