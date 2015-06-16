package bicycle;

public class BicycleTesting {

	
	public static void main(String[] args) {
		Bicycle bc1 = new Bicycle();
		Bicycle bc2 = new Bicycle();
		
		bc1.changeCadence(50);
		bc1.changeGear(3);
		bc1.speedUp(20);
		bc1.printStates();
		
		bc2.changeCadence(40);
		bc2.speedUp(30);
		bc2.changeGear(5);
		bc2.printStates();
	}

}
