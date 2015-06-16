package kontrolnogame;

public abstract class Hero {
	
	protected byte atack;
	protected byte deffence;
	protected byte health;
	
	public Hero(byte atack, byte deffence){
		this.atack = atack;
		this.deffence = deffence;
		this.health = 127;
	}
	
	public byte calculateAtack(Hero opposition){
		return this.atack;
	}
	
	public byte calculateDeffence(Hero opposition){
		return this.deffence;
	}
	
	

	public boolean isAlive() {
		if(health > 0){
			return true;
		}
		return false;
	}
	
	public void atack(Hero deffender){
		deffender.health = (byte) (deffender.health - att2(this.calculateAtack(deffender) - deffender.calculateDeffence(this)));
		//Живот на ударения = Живот на ударения - att2(Атака на противника - Защита на ударения)
	}

	private byte att2(int i) {
		if(i < 0){
			return 1;
		}
		else{
			return (byte) i;
		}
	}

	@Override
	public String toString() {
		return "Hero [atack=" + atack + ", deffence=" + deffence + ", health="
				+ health + "]";
	}
	
	
}

