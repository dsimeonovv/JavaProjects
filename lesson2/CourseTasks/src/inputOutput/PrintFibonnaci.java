package inputOutput;

public class PrintFibonnaci {
	public static void main(String[] args) {
		
		
		int n1=0;
		int n2=1;
		int sum=0;
		
        System.out.println("1. " + n1);
        System.out.println("2. " + n2);
        
      for(int i = 3; i <= 100; i++){
    	  
          sum = n1 + n2;
          n1 = n2;
          n2 = sum;
          System.out.printf("%d. %d", i, sum);
      }
      
	}
}
