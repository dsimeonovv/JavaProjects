package methods;

public class CountArray {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 5, 3, 2, 2, 4, 1};
		int value = 2;
		
		System.out.printf("The number %d is met in the array %d times", value, elementCounter(numbers,value));
	}
	
	public static int elementCounter(int[] arr, int num){
		int counter = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num){
				counter++;
			}
		}
		return counter;
	}
}
