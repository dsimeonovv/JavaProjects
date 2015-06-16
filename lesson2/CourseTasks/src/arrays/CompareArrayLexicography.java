package arrays;

import java.util.Scanner;

public class CompareArrayLexicography {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the length of the arrays: ");
		int length = input.nextInt();
		char[] firstArray = new char[length];
		char[] secondArray = new char[length];
		
		boolean check = true;

		System.out.printf("Enter the %d elements in first array:  ", length);
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = input.nextLine().charAt(length);
		}

		System.out.printf("Enter the %d elements in second array: ", length);
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = input.nextLine().charAt(length);
		}
		
		for (int i = 0; i < length; i++) {
			if(firstArray[i] != secondArray[i]){
				check = false;
			}
		}
		System.out.printf("The arrays are equal: %d", check);
	}
}
