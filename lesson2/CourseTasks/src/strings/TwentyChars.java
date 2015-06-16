package strings;

import java.util.Scanner;

public class TwentyChars {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = "";

		System.out.println("Input text(max 20 characters)");

		while (true) {
			input = in.next();

			if (input.length() > 20) {
				System.out.println("You entered more than 20 characters, try again");
			}

			else {
				while (input.length() < 20) {
					input += '*';
				}

				break;
			}
		}

		System.out.println("You've entered:");
		System.out.println(input);
	}
}
