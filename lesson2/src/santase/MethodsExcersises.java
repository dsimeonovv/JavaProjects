package santase;
import java.util.Scanner;


public class MethodsExcersises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*-----------Print Triangle------------*/
		/*Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		System.out.println();

		for(int line = 1; line <= n; line++){
			printLine(1, line);
		}
		
		for(int line = n - 1; line >= 1; line--){
			printLine(1, line);
		}
	}
	
	public static void printLine(int start, int end){
		for(int i = start; i <= end; i++){
			System.out.print(" " + i);
		}
		System.out.println();
	}*/
		Scanner input = new Scanner(System.in);
		System.out.println("What time is it?");
		
		System.out.print("Hours: ");
		int hours = input.nextInt();
		
		System.out.print("Minutes: ");
		int minutes = input.nextInt();
		
		boolean isValidTime = validateHours(hours) && validateMinutes(minutes);
		if(isValidTime){
			System.out.printf("The time is %d:%d now.%n", hours, minutes);
		}
		else{
			System.out.print("Incorrect time!");
		}
		
		System.out.println("n = ");
		int n = input.nextInt();
		
		long factorial = Factorial(n);
		System.out.printf("%d! = %d%n", n, factorial);		
		
	}

	public static boolean validateHours(int hours){
		boolean result = (hours >= 0) && (hours < 24);
		return result;
	}
	
	public static boolean validateMinutes(int minutes){
		boolean result = (minutes >= 0) && (minutes <= 59);
		return result;
	}
	
	public static long Factorial(int n){
		if(n == 0){
			return 1;
		}
		else{
			return n * Factorial(n-1);
		}
	}
}
