package santase;

public class Testing {

	public static void main(String[] args) {
		
		Deck deck = new Deck();

		Player player1 = new Player("Petq");
		
		
		System.out.println(player1.name + " versus computer(Dobri i Ceco)");
		
	
		deck.startGame();
	}

}
