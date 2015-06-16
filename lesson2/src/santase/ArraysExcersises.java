package santase;
import java.util.Scanner;
import java.util.Arrays;


public class ArraysExcersises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter how many elements you want for arrays: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		
		System.out.print("Enter the values of elements: ");
		System.out.println("First arr: ");
		for(int i = 0; i < n; i++){
			arr[i] = input.nextInt();
		}
		System.out.println("Second arr: ");
		for(int i = 0; i < n; i++){
			arr1[i] = input.nextInt();
		}
		
			/*if(arr.length == arr1.length){
				System.out.println("They are equals.");
			}
			else{
				System.out.println("They are not equals.");
			}*/
		
		for(int index = 0; index < arr.length; index++){
			if(arr[index] == arr1[index]){
				System.out.println("They are equals.");
			}
			else{
				System.out.println("They are not equals.");
			}
		}
		
		

	}

}