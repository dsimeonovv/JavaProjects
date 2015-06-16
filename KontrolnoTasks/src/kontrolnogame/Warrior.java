package kontrolnogame;


public class Warrior extends Hero {
	private byte armor;
	
	public Warrior(byte atack, byte deffence,byte armor) {
		super(atack, deffence);
		this.armor = armor;
	}
	
	@Override
	public byte calculateDeffence(Hero opposition) {
		if(opposition instanceof Barbarian){
			if(armor + deffence > 127){
				return 127;
			}
			else{ 
				return (byte) (armor + deffence);
			}
		}
		return super.calculateDeffence(opposition);
	}
	
}

