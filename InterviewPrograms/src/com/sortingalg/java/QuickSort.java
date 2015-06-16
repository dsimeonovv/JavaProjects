package com.sortingalg.java;

public class QuickSort {
	private int array[];
	private int length;
	
	 public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		sort.sort(input);
		for (int i : input) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
	
	public void sort(int[] inputArr){
		if(inputArr == null || inputArr.length == 0){
			return;
		}
		this.array = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
	}

	private void quickSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		//get the middle element of array called pivot
		int pivot = array[lowerIndex + (higherIndex - lowerIndex)/2];
		
		while (i <= j) {
			
			while(array[i] < pivot){
				i++;
			}
			
			while(array[j] > pivot){
				j--;
			}
			if(i <= j){
				swapNumber(i, j);
				//move index to next position on both sides
				i++;
				j--;
			}
			// call quickSort() method recursively
			if(lowerIndex < j){
				quickSort(lowerIndex, j);
			}
			else if(i < higherIndex){
				quickSort(i, higherIndex);
			}
		}
	}

	private void swapNumber(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
}
