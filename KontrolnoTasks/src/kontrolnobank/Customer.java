package kontrolnobank;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private long EGN;
	List<Account> bankAccount = new ArrayList();
	
	public Customer(String name, long EGN){
		this.name = name;
		this.EGN = EGN;
	}
	
	public void addAccount(Account account){
		bankAccount.add(account);
	}
	
	public void remonveAccount(Account number) throws Exception{
		for (int i = 0; i < bankAccount.size(); i++) {
			if(bankAccount.get(i).equals(number)){
				bankAccount.remove(number.getAccountNumber());
			}
			else{
				throw new Exception("There isnt such a number.");
			}
		}
		
	}
}
