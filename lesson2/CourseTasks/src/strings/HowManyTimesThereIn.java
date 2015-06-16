package strings;

import java.util.Scanner;

public class HowManyTimesThereIn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0;

		System.out.println("Enter some text");
		String inputText = input.next();

		inputText = inputText.toLowerCase();

		for (int i = 0; i < inputText.length() - 1; i++) {
			if (inputText.indexOf(i) == 'i' && inputText.indexOf(i + 1) == 'n') {
				counter++;
			}
		}

		System.out.printf("The substring \"in\" is met in the text %d times.", counter);
	}
}
