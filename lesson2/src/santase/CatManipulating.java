package santase;


public class CatManipulating {

	public static void main(String[] args) {
		
		Cat myCat = new Cat();
		myCat.name = "Alfed";
		
		System.out.printf("The cat's name is %s%n", myCat.name);
		myCat.sayMiau();
	}

}
