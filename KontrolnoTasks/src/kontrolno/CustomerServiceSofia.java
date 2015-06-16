package kontrolno;

public class CustomerServiceSofia extends CustomerService {
	private final static String city = "Sofia";
	private String municipality;
	
	public CustomerServiceSofia(int counter, String municipality){
		super(counter);
		this.municipality = municipality;
	}
	
	public static long addInquiry(PropertyInquiry inq){
		if(inq.getCity().equals(city)){
			CustomerService.list.add(inq);
			inq.setNumber(seqNumber++);
		}
		return inq.getNumber();
		
	}
	
	
}
