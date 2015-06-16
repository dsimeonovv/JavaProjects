package operatorsExpressions;

public class PrimeInteger {
	
	public static void main(String[] args) {
		int primeInt = 37;
		
		if(primeInt / primeInt == 1 && primeInt / 1 == primeInt){
			System.out.println("The number is prime");
		}
		else{
			System.out.println("The number is not prime");
		}
	}
}
