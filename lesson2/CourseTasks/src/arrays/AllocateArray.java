package arrays;


public class AllocateArray {
	
	public static void main(String[] args) {
		
		int[] array = new int[20];
		
		for (int i = 0; i < 20; i++) {
			array[i] = i * 5;
		}
		
		for (int arr : array) {
			System.out.println(arr);
		}
		
		
	}
}
