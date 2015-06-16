package kontrolnobank;

public class VIPAccount extends Account {
	private int amount;
	
	@Override
	public void reduceMoney(int wantedMoney) throws Exception {
		if(wantedMoney < this.amount){
			System.out.println("Izteglen e kredit");
		}
		super.reduceMoney(wantedMoney);
	}
}
