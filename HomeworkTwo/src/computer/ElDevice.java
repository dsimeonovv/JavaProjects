package computer;

public class ElDevice {
	private double supplyVoltage;
	private String processorName;
	
	public double getSupplyVoltage() {
		return supplyVoltage;
	}
	
	public void setSupplyVoltage(double supplyVoltage) {
		this.supplyVoltage = supplyVoltage;
	}
	
	public String getProcessorName() {
		return processorName;
	}
	
	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}
	
	public ElDevice(double supplyVoltage, String processorName){
		if(supplyVoltage <= 0){
			this.supplyVoltage = Math.abs(supplyVoltage);
		}
		else{
			this.supplyVoltage = supplyVoltage;
		}
		
		this.processorName = processorName;
	}
	
	public boolean isTurnedOn(){
		if(supplyVoltage > 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isTurnedOff(){
		if(supplyVoltage == 0 || supplyVoltage < 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Processor has Supply Voltage: " + this.supplyVoltage + "V" + " and Processor Name: " +  this.processorName;
	}
	
}
