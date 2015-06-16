package loops;

import java.util.Scanner;

public class PrintNumbersNotDivisible3And7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value you want to see numbers: ");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if(i % 3 != 0 && i % 7 != 0){
				System.out.print(i + " ");
			}
		}
	}
}
