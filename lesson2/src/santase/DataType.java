package santase;

public class DataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		char symbol = 'a';
		
		System.out.println("The code of '" + symbol + "' is: " + (int) symbol);
		
		String firstName = "Ivan";
		String lastName = "Ivanov";
		String fullName = firstName + " " + lastName;
		
		System.out.println("Hello, " + firstName + "!");
		System.out.println("Your full name is: " + fullName);
		
		Object container = 5;
		Object container2 = "Text";
		
		System.out.println("The value of container is: " + container);
		System.out.println("The value of container2 is: " + container2);
		
		int a = 5;
		int b = 10;
		//int c;
		
		//c = a + b;
		//a = c - a;
		//b = c - b;
		
		//a+=b;
		b+=a;
		b=a;
		a=b;
		a+=b;
		
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		
		System.out.println('*');
	}

}
