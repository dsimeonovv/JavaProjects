package methods;

public class ReverseDigit {
	public static void main(String[] args) {
		int a = 123456789;
        a = Reverse(a);
        System.out.println(a);
	}

	public static int Reverse(int num) {
		int multiplyer = 1;
		int[] digArr = new int[10];
		int i = 0;
		while (num > 0) {
			digArr[i] = num % 10;
			num /= 10;
			i++;
		}
		while (i > 0) {
			i--;
			num += digArr[i] * multiplyer;
			multiplyer *= 10;
		}
		return num;
	}
}
