package arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class FindSumofKVariables {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter array length: ");
		int n = input.nextInt();
		
		System.out.println("Enter value for K: ");
		int k = input.nextInt();
		
		int sum = 0;
		
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		
		for (int i = 0; i < k; i++) {
			sum += array[i];
		}
		System.out.printf("The sum of %d elements in array is %d", k, sum);
		
		
	}
}
