package operatorsExpressions;

public class ThirdNumber {
	
	public static void main(String[] args) {
		int num = 1728;
		int num1;
		int num2;
		
		num1 = num / 100;
		num2 = num1 % 10;
		
		if(num2 == 7){
			System.out.println("The third number of number is 7");
		}
		else{
			System.out.println("The third number is not 7");
		}
	}
}
