package computer;

public class Laptop extends ElDevice {
	private int RAM;
	private int HDD;
	
	public int getRAM() {
		return RAM;
	}
	
	public void setRAM(int RAM) {
		this.RAM = RAM;
	}
	
	public int getHDD() {
		return HDD;
	}
	
	public void setHDD(int HDD) {
		this.HDD = HDD;
	}
	
	public Laptop(int RAM, int HDD, int supplyVoltage, String processorName){
		super(supplyVoltage, processorName);
		if(RAM < 0){
			this.RAM = Math.abs(RAM);
		}
		else{
			this.RAM = RAM;
		}
		if(HDD < 0){
			this.HDD = Math.abs(HDD);
		}
		else{
			this.HDD = HDD;
		}
	}
	
	public boolean isBetter(Laptop laptop){
		
		if(this.RAM > laptop.RAM){
			return true;
		}
		else if(this.HDD > laptop.HDD){
			return true;
		}
		else{
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Laptop with RAM:" + this.RAM + "MB" + " and HDD: " + this.HDD + "GB";
	}
	
	
}
