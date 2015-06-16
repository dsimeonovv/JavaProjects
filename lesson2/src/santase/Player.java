package santase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

	Scanner input = new Scanner(System.in);
	public String name;
	List<Card> playHand = new ArrayList<Card>();
	List<Card> pointHand = new ArrayList<Card>();

	int points = 0;

	public Player(String name) {
		this.name = name;
	}

	public void addCard(Card card) {
		playHand.add(card);
	}

	public void addPointCard(Card card) {
		pointHand.add(card);
		points += card.cardPoint();
	}

	public void CheckForBelot(Card card, Card koz) {
		int belotPoints;
		if (card.getRank() != 3 && card.getRank() != 4) {
			return;
		}
		if (koz.getSuit() == card.getSuit()) {
			belotPoints = 40;
		} else {
			belotPoints = 20;
		}

		if (checkBelot(card)) {
			points += belotPoints;
			System.out.println("Imame belot: " + belotPoints + "tochki");
		}

	}

	private boolean checkBelot(Card card) {
		for (int i = 0; i < playHand.size(); i++) {
			Card c = playHand.get(i);
			if (c.getRank() == 3 || c.getRank() == 4) {
				if (c.getSuit() == card.getSuit()) {
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * 
	 * @return wrushta karta ot rukata i q maha ot tam
	 */
	public Card drawCard() {
		showHandCards();
		System.out.print(this.name);
		System.out.println(" , it's your turn to select Card: ");
		int n = input.nextInt();
		while(n < 0 || n > playHand.size()-1){
			System.out.print(this.name + " wrong number :(:");
			System.out.print(" , Please select again :): ");
			n = input.nextInt();
		}
		System.out.print(this.name  + " selected this card:");
		playHand.get(n).printCard();
		return playHand.remove(n);
	}

	public void showHandCards() {
		System.out.println(this.name + " this is your hand :)");
		for (int i = 0; i < playHand.size(); i++) {
			System.out.print(i + ":");
			playHand.get(i).printCard();
		}

	}

	public boolean isWinner() {
		if (points >= 66) {
			return true;
		} else {
			return false;
		}
	}

	private int calculatePoints() {
		int sumPoints = 0;
		for (int i = 0; i < pointHand.size(); i++) {
			sumPoints += pointHand.get(i).cardPoint();
		}
		return sumPoints;
	}

	public boolean proverkaZaRazmqna(Card koz) {
		for (int i = 0; i < playHand.size(); i++) {
			Card c = playHand.get(i);
			if (c.getSuit() == koz.getSuit()) {
				return true;
			}
		}
		return false;
	}

	public boolean daliIskaRazmqna() {
		this.showHandCards();
		System.out.println("Iskate li da razmenite(yes/no): ");
		String answer = input.next();
		if(answer.equalsIgnoreCase("Yes")){
			return true;
		}
		return false;
	}

	public void drawCardEmptyDeck(Card firstPlCard, Card koz) {
		
		
		
	}

}
