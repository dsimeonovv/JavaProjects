package tasks;

public class ArraysDuplicate {

	public static void main(String[] args) {

		int[] array1 = new int[] { 1, 2, 3, 4, 5 };
		int[] array2 = new int[] { 0, 1, 3, 7, 8 };
		int count = 0;
		int sum = 0;
		int i;

		for (i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				count += 1;
				System.out.println("The number that is not contain in second array is: " + array2[i]);
				sum += array2[i];
			}
		}
		System.out.println("The sum of missing values in second array is: " + sum);
	}

}