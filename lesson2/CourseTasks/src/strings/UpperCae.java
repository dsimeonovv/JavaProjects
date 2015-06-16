package strings;

import java.nio.charset.Charset;
import java.util.Scanner;

public class UpperCae {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Write input here: ");
		String inputText = input.next();
		String result = "";

		for (int i = 0; i < inputText.length(); i++) {
			if (inputText.length() - i > 7) {
				if (inputText.substring(i, 8) == "<upcase>") {
					i += 8;

					while (inputText.substring(i, 9) != "</upcase>") {
						result += Char.ToUpper(inputText.indexOf(i));
						i++;
					}

					i += 8;
				} else {
					result += inputText.indexOf(i);
				}
			} else {
				result += inputText.indexOf(i);
			}
		}
		System.out.println(result);
	}
}
