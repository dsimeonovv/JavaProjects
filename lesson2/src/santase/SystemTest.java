package santase;

public class SystemTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int sum = 0;
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 10000000; i++){
			sum++;
		}
		
		long endTime = System.currentTimeMillis();
		System.out.printf("The time is %f",(endTime - startTime)/1000.0);

	}

}
