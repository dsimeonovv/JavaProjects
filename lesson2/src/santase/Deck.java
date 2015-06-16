package santase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> deck = new ArrayList<>(24);

	Player player1 = new Player("Petq");
	Player player2 = new ComputerPlayer("Computer Player:");

	private void generateCards() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				deck.add(new Card(i, j));
			}
		}
		randomizeDeck();
	}

	public void showAllCards() {
		for (int i = 0; i < deck.size(); i++) {
			System.out.print(i + ":");
			deck.get(i).printCard();
		}
	}

	public Card giveCard() {
		return deck.remove(0);
	}

	private void randomizeDeck() {
		for (int i = 0; i < deck.size(); i++) {
			int rand = (int) (Math.random() * 24);
			Collections.swap(deck, i, rand);
		}
	}

	public void startGame() {
		generateCards();
		// give each player 6 cards
		for (int i = 0; i < 6; i++) {
			player1.addCard(this.giveCard());
			player2.addCard(this.giveCard());
		}
		// show the last card(koz)
		Card koz = deck.remove(deck.size() - 1);

		Player firstPlayer = player2;
		Player secondPlayer = player1;
		while (true) {
			System.out.print(" --- KOZ ---- >>>> ");
			koz.printCard();
			// proverka dali e vuzmojna razmqna
			if (firstPlayer.proverkaZaRazmqna(koz)) {
				// pitane na igracha dali iska razmqna
				if (firstPlayer.daliIskaRazmqna()) {
					System.out.println("Choose card for change:");
					Card cardForChange = firstPlayer.drawCard();
					if (cardForChange.getSuit() == koz.getSuit()) {
						firstPlayer.addCard(koz);
						koz = cardForChange;
						System.out.print(" --- KOZ ---- >>>> ");
						koz.printCard();
					} else {
						firstPlayer.addCard(cardForChange);
						System.out.println("Sorry cannot change this card");
					}
				}

			}

			// ask first player to give card
			Card cardFirst = firstPlayer.drawCard();
			firstPlayer.CheckForBelot(cardFirst, koz);

			// ask second
			// ako deka e prazen
			// proverqvame dali
			Card cardSecond = null;
			if (deck.isEmpty()) {
				secondPlayer.drawCardEmptyDeck(cardFirst, koz);
			} else {
				cardSecond = secondPlayer.drawCard();
			}

			System.out.println(" -----Battle: ----");
			System.out.print(firstPlayer.name + ":");
			cardFirst.printCard();
			System.out.print(secondPlayer.name + ":");
			cardSecond.printCard();
			// compare cards and give the two cards to the winner
			if (cardFirst.isBiggerCard(cardSecond, koz)) {
				firstPlayer.addPointCard(cardFirst);
				firstPlayer.addPointCard(cardSecond);
			} else {
				secondPlayer.addPointCard(cardFirst);
				secondPlayer.addPointCard(cardSecond);
				Player temp = firstPlayer;
				firstPlayer = secondPlayer;
				secondPlayer = temp;
			}
			System.out.println(firstPlayer.name + " won this hand!");
			// deck give each player one card
			if (!deck.isEmpty()) {
				firstPlayer.addCard(this.giveCard());
				if (!deck.isEmpty()) {
					secondPlayer.addCard(koz);
				} else
					secondPlayer.addCard(this.giveCard());
			}
			// check for winner

			if (firstPlayer.isWinner()) {
				System.out.println(firstPlayer.name + "is winner");
				break;
			}

			System.out.println("======== NEW HAND ==========");
		}
	}
}
