package kontrolno;

public class Barbarian extends Hero{
	private byte bloodlust;
	
	public Barbarian(byte atack, byte deffence, byte bloodlust){
		super(atack, deffence);
		this.bloodlust = bloodlust;
	}
	
	@Override
	public byte calculateAtack(Hero opposition) {
		if(opposition instanceof Archer){
			if(atack + bloodlust > 127){
				return 127;
			}
			else{
				return (byte) (atack + bloodlust);
			}
		}
		return super.calculateAtack(opposition);
	}
}
