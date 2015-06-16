package conditionalStatements;

import java.util.Scanner;

public class ScoreTask {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter digit between 1 and 9 to see new score: ");
		byte score = input.nextByte();
		
		switch (score) {
		case 1:
			score *= 10;
			System.out.println("The new score is: " + score);
			break;
		case 2:
			score *= 10;
			System.out.println("The new score is: " + score);
			break;
		case 3:
			score *= 10;
			System.out.println("The new score is: " + score);
			break;
		case 4:
			score *= 100;
			System.out.println("The new score is: " + score);
			break;
		case 5:
			score *= 100;
			System.out.println("The new score is: " + score);
			break;
		case 6:
			score *= 100;
			System.out.println("The new score is: " + score);
			break;
		case 7:
			score *= 1000;
			System.out.println("The new score is: " + score);
			break;
		case 8:
			score *= 1000;
			System.out.println("The new score is: " + score);
			break;
		case 9:
			score *= 1000;
			System.out.println("The new score is: " + score);
			break;

		default:
			System.out.println("Mistake!");
			break;
		}
	}
}
