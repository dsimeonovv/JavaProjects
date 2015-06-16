package izpit;

import java.awt.List;
import java.util.ArrayList;

public class Computer {
	Computer computer2 = new Computer(192, 2140);
	Computer IP;
	Computer roomNumber;
	private ArrayList<Computer> computer = new ArrayList<Computer>();
	
	
	public Computer getIP() {
		return IP;
	}
	public void setIP(Computer iP) {
		IP = iP;
	}
	public Computer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Computer roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public void addComputer(Computer computer){
		computer.add(computer);
		computer.setIP(this);
	}
	
	public Computer(int IP, int roomNumber){
		this.IP = this.IP;
		this.roomNumber = this.roomNumber;
		
	}

}
