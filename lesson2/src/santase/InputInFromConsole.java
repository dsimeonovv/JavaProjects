package santase;
import java.util.Scanner;


public class InputInFromConsole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program is very interesting.");
		
		System.out.println("Enter one number: ");
		int a = input.nextInt();
		System.out.println("Enter second number: ");
		int b = input.nextInt();
		
		
		if(a>b){
			a-=b;
			b+=a;
			a = b-a;
			System.out.println(a);
			System.out.println(b);
		}
		else{
			System.out.println("Try again dude!");
		}
	}
}
