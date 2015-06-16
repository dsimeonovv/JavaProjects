package kontrolno;

public class Employee {
	private String name;
	private long id;
	private long numberDepartement;
	
	public Employee(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) throws Exception {
		if(id < 1000000000 && id > 999999999){
			this.id = id;
		}
		else{
			throw new Exception();
		}
		
	}

	public long getNumberDepartement() {
		return numberDepartement;
	}

	public void setNumberDepartement(long numberDepartement) {
		this.numberDepartement = numberDepartement;
	}
	
}
