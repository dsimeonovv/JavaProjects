package computer;


public class TestingComputers {
	public static void main(String[] args) {
		ElDevice ed1 = new ElDevice(220.20, "Intel");
		ElDevice ed2 = new ElDevice(220.50, "AMD");
		
		System.out.println(ed1.isTurnedOn());
		System.out.println(ed1.toString());
		ed1.setProcessorName("AMD");
		ed1.setSupplyVoltage(230);
		System.out.println(ed1.toString());
		System.out.println(ed2.toString());
		
		
		Laptop laptop = new Laptop(1024, 250, 220, "AMD");
		Laptop laptop2 = new Laptop(2048, 1000, 230, "Intel");
		
		
		System.out.println(laptop.toString());
		laptop.setHDD(2500);
		laptop.setRAM(4096);
		System.out.println(laptop.toString());
		System.out.println(laptop2.toString());
		
		System.out.println(laptop.isBetter(laptop2));
	}
}