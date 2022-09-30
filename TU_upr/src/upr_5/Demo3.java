package upr_5;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			int age = ageInput(in);
			System.out.println("You age is ok: "  + age);
		} catch (AgeChecker e) {
			System.out.println(e.getMessage());
		}finally {
			in.close();
		}

	}
	public static int ageInput(Scanner in) throws AgeChecker{
		System.out.print("Your age:");
		int age = in.nextInt();
		if(age<18||age>29) {
			throw new AgeChecker("[18,29]");
		}
		return age;
	}

}
