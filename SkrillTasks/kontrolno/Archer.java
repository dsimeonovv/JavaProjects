package kontrolno;

public class Archer extends Hero {
	
	private byte flameArrows;
	
	public Archer(byte atack, byte deffence, byte flameArrows){
		super(atack, deffence);
		this.flameArrows = flameArrows;
	}
	
	@Override
	public byte calculateAtack(Hero opposition) {
		if(opposition instanceof Warrior){
			if(atack + flameArrows > 127){
				return 127;
			}
			else{
				return (byte) (atack + flameArrows);
			}
		}
		return super.calculateAtack(opposition);
	}
}
