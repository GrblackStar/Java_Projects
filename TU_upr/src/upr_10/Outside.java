package upr_10;

import java.util.Scanner;

public class Outside {
	Scanner in = new Scanner(System.in);
	public double sum(){
		class Help{
			public double inputNumber(Scanner in) {
				System.out.print("Please anter a number:");
				double number = in.nextDouble();
				//validation
				return number;
			}
		}
		Help help = new Help();
		double sum = 0;
		double num1 = help.inputNumber(in);
		sum+=num1;
		double num2 = help.inputNumber(in);
		sum+=num2;
		double num3 = help.inputNumber(in);
		sum+=num3;
		double num4 = help.inputNumber(in);
		sum+=num4;
		double num5 = help.inputNumber(in);
		sum+=num5;
		return sum;
	}
}
