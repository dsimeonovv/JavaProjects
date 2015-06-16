package kontrolnobank;

public class Testing {
	public static void main(String[] args) throws Exception {
		Bank bank = new Bank("UniCredit", "Sofia", 123);
		Customer cst = new Customer("Dobri", 940606402);
		VIPAccount vip = new VIPAccount();
		Account account = new Account();
		
		account.addMoney(5000);
		
		System.out.println(account.showAmountInAccount());
		System.out.println(vip.addMoney(5000));
		
		bank.printData();
		}
}
