package MaxArray;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static int solution(int[] A) {
		// returns the max of the one digit numbers
		// if there are no one digit numbers -> returns the max of the array
		// "at least one element that satisfies the condition" -> suggests that if the array has 2...
		// ... or more digit numbers, there still should be a solution

		int max = A[0];

		if (A.length >= 1 && A.length <= 1000) {
			for (int i = 0; i < A.length; i++) {
				if (A[i] >= -9 && A[i] <= 9 && A[i] >= -10000 && A[i] <= 10000) {
					if (A[i] >= max) {
						max = A[i];
					}
				}
			}
		} else {
			System.out.print("Your array length is out of range ");
		}

		
		if (max >= -9 && max <= 9) {
			return max;
		} else {
			//it was not specified what the return should be if there are no 1 digit numbers, 
			//so the method should return the max of the whole array
			return Arrays.stream(A).max().getAsInt();
			
			// or we can return -1 for error like this:
			//return -1;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.print("Enter the number of elements you want to store: ");
		n = sc.nextInt();

			int[] array = new int[n];
			System.out.println("Enter the elements of the array: ");

			for (int i = 0; i < n; i++) {
				array[i] = sc.nextInt();
			}

			int max = solution(array);
			System.out.println(max);

		sc.close();


	}
}
