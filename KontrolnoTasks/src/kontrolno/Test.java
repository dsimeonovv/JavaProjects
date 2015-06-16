package kontrolno;

public class Test {
	public static void main(String[] args) {
		Employee empl = new Employee();
		empl.setName("Gosho");
		CustomerServiceSofia CSS = new CustomerServiceSofia(10, "Sofia-stolica");
		CSS.setEmpl(empl);
		
		CSS.addInquiry(new PropertyInquiry("Gosho", "Pesho", 24, "Sofia"));
		//CSS.addInquiry(new PropertyInquiry("Dobri", "Sevdo", 32, "Sofia"));
		CSS.addInquiry(new PropertyInquiry("Vladko", "Djoni", 45, "Sofia"));
		CSS.addInquiry(new PropertyInquiry("Dobri", "Vladko", 33, "Sofia"));
		
		
		System.out.println(CustomerService.list.get(2).getNewOwner());
		System.out.println(CustomerService.list.size());
	}
}
