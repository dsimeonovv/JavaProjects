package santase;

public class Card {
	private int suit;
	private int rank;

	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void printCard() {
		switch (rank) {
		case 0:
			System.out.print("9");
			break;
		case 1:
			System.out.print("10");
			break;
		case 2:
			System.out.print("Jack");
			break;
		case 3:
			System.out.print("Queen");
			break;
		case 4:
			System.out.print("King");
			break;
		case 5:
			System.out.print("Ace");
			break;
		default:
			break;
		}
		switch (suit) {
		case 0:
			System.out.println(" Clubs");
			break;
		case 1:
			System.out.println(" Diamonds");
			break;
		case 2:
			System.out.println(" Hearts");
			break;
		case 3:
			System.out.println(" Spade");
			break;
		default:
			break;
		}
	}
	
	public int cardPoint(){
		switch (rank) {
		case 0:
			//System.out.print("9");
			return 0;
		case 1:
			//System.out.print("10");
			return 10;
		case 2:
			//System.out.print("Jack");
			return 2;
		case 3:
			//System.out.print("Queen");
			return 3;
		case 4:
			//System.out.print("King");
			return 4;
		case 5:
			//System.out.print("Ace");
			return 11;
		default:
			return 0;
		}
	}
	
	public boolean isBiggerCard(Card c, Card koz){
		if(this.suit == c.suit){
			if(this.rank < c.rank){
				return false;
			}
		}
		else if(c.suit == koz.suit){
			return false;
		}
		return true;
	}
}
