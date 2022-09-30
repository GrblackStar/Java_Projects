package upr_5;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Your age:");
		try {
			int age = Integer.parseInt(in.nextLine());//in.nextInt();
			System.out.println("You are "+age+" years old.");
		}catch(NumberFormatException e){
			System.out.println("Your age should be a number: "+e.getMessage());
		}finally {
			in.close();
		}
		
		System.out.println("Goodbye!");
	}

}
