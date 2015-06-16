package arrays;

import java.util.Scanner;

public class MaxSequence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Array length: ");
		int length = input.nextInt();

		int[] numbersArray = new int[length];
		int secCounter = 0;
		int maxSecVal = 0;
		int curSecCounter = 0;

		System.out.printf("Enter %d elements for the array!", length);
		for (int index = 0; index < length; index++)
			numbersArray[index] = input.nextInt();

		for (int index = 0; index < length - 1; index++) {
			if (numbersArray[index] == numbersArray[index + 1] - 1) {
				if (curSecCounter == 0) {
					maxSecVal = numbersArray[index];
					curSecCounter++;
				}
				curSecCounter++;
			} else {
				if (curSecCounter >= secCounter) {
					secCounter = curSecCounter;
					curSecCounter = 0;
				} else {
					curSecCounter = 0;
				}
			}
		}
		System.out.println("Max Sequence is: ");
		for (int counter = 0; counter < secCounter; counter++)
			System.out.print((maxSecVal + counter) + " ");
	}
}
