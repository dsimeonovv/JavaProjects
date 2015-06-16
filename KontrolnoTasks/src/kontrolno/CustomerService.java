package kontrolno;

import java.util.ArrayList;

public class CustomerService {
	static ArrayList<PropertyInquiry> list = new ArrayList<>();
	private int counterNumber;
	Employee empl;
	protected static int seqNumber;
	
	
	public Employee getEmpl() {
		return empl;
	}

	public void setEmpl(Employee empl) {
		this.empl = empl;
	}

	public CustomerService(int counter){
		this.counterNumber = counter;
	}
	
	public static long addInquiry(PropertyInquiry inq){
		list.add(inq);
		inq.setNumber(seqNumber++);
		
		return inq.getNumber();
	}
	
	public static void removeInquiry(long number){
		for (int i = 0; i < list.size(); i++) {
			PropertyInquiry inq = list.get(i);
			if(inq.getNumber() == number){
				list.remove(inq);
			}
		}
	}
	
}
