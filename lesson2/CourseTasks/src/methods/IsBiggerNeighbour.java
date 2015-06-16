package methods;

public class IsBiggerNeighbour {
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 3, 2, 2, 4, 1};
		
		isBiggerNeighbour(numbers);
	}
	
	public static int isBiggerNeighbour(int[] arr){
		
		int counter = 0;
		
		for (int i = 0; i < arr.length - 2; i++) {
			if(arr[i] > arr[i + 1] && arr[i] > arr[i + 2]){
				counter++;
			}
		}
		return counter;
	}
}
