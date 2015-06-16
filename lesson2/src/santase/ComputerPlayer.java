package santase;


public class ComputerPlayer extends Player{

	public ComputerPlayer(String name) {
		super(name);
	}

	@Override
	public Card drawCard() {
		int rand = (int) (Math.random() * this.playHand.size());
		System.out.print(this.name  + " selected this card:");
		playHand.get(rand).printCard();
		return playHand.remove(rand);
	}
	
	@Override
	public boolean daliIskaRazmqna() {
		int rand = (int) (Math.random() * 2);
		if(rand == 1){
			return true;
		}
		return false;
	}
	

}
