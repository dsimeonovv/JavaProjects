package santase;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
 * first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 * @author
 */

public class Exercises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Scanner input = new Scanner(System.in);
		int firstNumber = 0;
		int secondNumber = 1;
		long nextNumber = firstNumber + secondNumber;
		
		
		System.out.print("Enter one number for Fibonachi: ");
		int n = input.nextInt();
		
		System.out.print("The Fibonachi is ");
		System.out.print(firstNumber + " " + secondNumber);
		
		
		for(int i = firstNumber; i <= n; i++){
			//long newNumber = (nextNumber - 1) + (nextNumber - 2);
			//System.out.print(i);
			int newI = (firstNumber - 1) + (secondNumber - 2);
			System.out.print(newI);
			
		}*/
		
		/*int[] myArray = new int[] {1, 2, 3, 4, 5};
		
		int length = myArray.length;
		int reversed[] = new int[length];
		
		for(int index = 0; index < length; index++){
			reversed[length - index - 1] = myArray[index];
		}
		System.out.println(Arrays.toString(reversed));
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++){
			array[i] = input.nextInt();
		}
		boolean symmetric = true;
		for(int i = 0; i < (array.length + 1) / 2; i++){
			if(array[i] != array[n - i - 1]){
				symmetric = false;
			}
		}
		System.out.printf("Symmetric: %b%n", symmetric);
		
	}*/
		
		
	}

}
