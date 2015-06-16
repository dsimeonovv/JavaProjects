package methods;

public class ReturnTheFirstBiggerElement {
	public static void main(String[] args) {
		int[] numArr = { 1, 3, 5, 7, 9, 9, 9, 9 };

        System.out.printf("The first number that is greater than its neighbours is at position %d", IsGreater(numArr));
	}

	public static int IsGreater(int[] arr) {
		for (int pos = 0; pos < arr.length - 1; pos++) {
			if (pos == 0) {
				if (arr[pos] > arr[pos + 1]) {
					return pos;
				}
			} else if (pos == arr.length - 1) {
				if (arr[pos] > arr[pos - 1]) {
					return pos;
				}
			} else {
				if (arr[pos] > arr[pos - 1] && arr[pos] > arr[pos + 1]) {
					return pos;
				}
			}
		}
		return -1;
	}
}
