package arrays;

import java.util.Scanner;

public class CompareTwoArrays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of the arrays: ");
		int length = input.nextInt();
		int[] firstArray = new int[length];
		int[] secondArray = new int[length];
		
		System.out.printf("Enter the %d elements in first array:  ", length);
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = input.nextInt();
		}
		
		System.out.printf("Enter the %d elements in second array: ", length);
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = input.nextInt();
		}
		
		for (int i = 0; i < length; i++) {
			if(firstArray[i] > secondArray[i]){
				System.out.printf("The %d element of the FirstArray is greater than %d element in SecondArray%n", i,i);
			}
			if(firstArray[i] < secondArray[i]){
				System.out.printf("The %d element of the FirstArray is less than %d element in SecondArray%n", i,i);
			}
			if(firstArray[i] == secondArray[i]){
				System.out.printf("The elements %d and %d from two arrays are equal%n", i, i);
			}
			
		}
		
	}
}
