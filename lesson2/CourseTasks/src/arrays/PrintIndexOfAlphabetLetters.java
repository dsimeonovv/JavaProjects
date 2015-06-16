package arrays;

import java.util.Scanner;

public class PrintIndexOfAlphabetLetters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		
		System.out.println("Enter a word: ");
		String word = input.nextLine();
		
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if(word.charAt(i) == alphabet[j]){
					System.out.println(j + 1 + " ");
				}
			}
		}
	}
}
