package com.sortingalg.java;

public class BubbleSort {
	
	public static void bubbleSort(int array[]){
		int n = array.length;
		int k;
		
		for (int m = n; m >= 0; m--) {
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if(array[i] > array[k]){
					swapNumber(i, k, array);
				}
			}
			printNumbers(array);
		}
	}

	private static void printNumbers(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}

	private static void swapNumber(int i, int j, int[] array) {
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubbleSort(input);
	}
}
