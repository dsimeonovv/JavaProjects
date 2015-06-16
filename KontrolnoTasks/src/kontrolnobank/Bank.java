package kontrolnobank;

public class Bank {
	private String name;
	private String town;
	private int cloneNumber;
	
	public Bank(String name, String town, int cloneNumber){
		this.name = name;
		this.town = town;
		this.cloneNumber = cloneNumber;
	}
	
	public String getName(){
		return name;
	}
	
	public String getTown(){
		return town;
	}
	
	public int getCloneNumber(){
		return cloneNumber;
	}
	
	public void setCloneNumber(int cloneNumber){
		this.cloneNumber = cloneNumber;
	}
	
	public void printData(){
		System.out.println("Bank name: " + this.name + ", in town: " + this.town + ", with clone number: " + this.cloneNumber);
	}
}
