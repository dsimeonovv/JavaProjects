package kontrolno;

public class PropertyInquiry {
	private String currentOwner;
	private String newOwner;
	private long id;
	private String city;
	private long number;
	
	public PropertyInquiry(String currentOwner, String newOwner, long id, String city){
		this.city = city;
		this.currentOwner = currentOwner;
		this.newOwner = newOwner;
		this.id = id;
		this.number = 0;
	}

	public String getCurrentOwner() {
		return currentOwner;
	}

	public String getNewOwner() {
		return newOwner;
	}

	public long getId() {
		return id;
	}

	public String getCity() {
		return city;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
	
	
}
