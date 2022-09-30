package upr_5;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] numbers = {2,30,25,16};
		System.out.println(Arrays.toString(numbers));
		try {
			System.out.print("delitel:");
			int delitel = in.nextInt();
			DevideArrayElements(numbers, delitel);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Element count should be 5: you tried to access element with index "+e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("Forbidden arithmetic operation:"+e.getMessage());
		}catch(Exception e) {
			System.out.println("Something went wrong.");
		}
		
		in.close();
		System.out.println(Arrays.toString(numbers));
	}
	
	public static void DevideArrayElements(int[] numbers, int delitel) throws Exception{

			for(int i=0;i<5;i++) {
				numbers[i]=numbers[i]/delitel;
			}
		
		
	}

}
