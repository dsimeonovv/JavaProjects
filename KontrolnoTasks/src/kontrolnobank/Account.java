package kontrolnobank;

public class Account {
	private int accountNumber;
	private String inWhichBankIsOpen;
	private int amount;
	
	public Account(){
		this.accountNumber = accountNumber;
		this.inWhichBankIsOpen = inWhichBankIsOpen;
		this.amount = amount;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public String getInWhichBankIsOpen(){
		return inWhichBankIsOpen;
	}
	
	protected int showAmountInAccount(){
		return this.amount;
	}
	
	private int changeAmount(int newAmount){
		this.amount = newAmount;
		return newAmount;
	}
	
	protected int addMoney(int money) throws Exception{
		if(money > 0){
			return money += changeAmount(money);
		}
		else if(money <= 0){
			throw new Exception("Error");
		}
		return money;
	}
	
	public void reduceMoney(int wantedMoney) throws Exception{
		if(wantedMoney <= this.amount){
			wantedMoney -= changeAmount(wantedMoney);
		}
		else if(wantedMoney > this.amount){
			throw new Exception("There isnt enough money in account.");
		}
	}
}
