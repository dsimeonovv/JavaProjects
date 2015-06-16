package inputOutput;

public class CalculateSum {
	public static void main(String[] args) {
		
		float sum = 1;
		
        for (int i = 2; i < 400000 ; i++) {
        	
            if (i % 2 == 0){
            	sum += 1 / (float) i;
            }
            else{
            	sum -= 1 / (float) i;
            }
        }
        System.out.printf("%f",sum);
	}
}
