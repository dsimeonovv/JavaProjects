package hotel.client.server;

public class Room {
	private int beds;
	private boolean description;
	private boolean isAvailable;
	
	public Room(int beds, boolean description, boolean isAvailable){
		this.beds = beds;
		this.description = description;
		this.isAvailable = isAvailable;
	}

	public int isBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public boolean isDescription() {
		return description;
	}

	public void setDescription(boolean description) {
		this.description = description;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
	
}
