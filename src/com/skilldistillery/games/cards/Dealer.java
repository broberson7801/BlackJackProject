package com.skilldistillery.games.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {
	private List<CardBuilder> hand = new ArrayList<>();

	public List<CardBuilder> getHand() {
		return hand;
	}

	public void setHand(List<CardBuilder> hand) {
		this.hand = hand;
	}

	private Deck deck = new Deck();

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public Dealer() {
		deck = new Deck();
		deck.buildDeck();
	}

	public void shuffleDeck() {
		Collections.shuffle(deck.getCardsDeck());

	}

	public List<CardBuilder> dealCardsToPlayer(int numCards) {
		List<CardBuilder> cards = new ArrayList<>();
		for (int i = 0; i < numCards; i++) {
			cards.add(deck.getCardsDeck().remove(0));
		}

		return cards;
	}

	public void addCardTohand(List<CardBuilder> cards) {
		hand.addAll(cards);
	}

	public void printHand(String type) {
		if (type.equals("ALL")) {
			for (CardBuilder cardBuilder : hand) {
				System.out.println();
				System.out.println("Dealer: " + cardBuilder);
			}
		} else {
			System.out.println();
			System.out.println("Dealer: CARD FACED DOWN \n" + "Dealer: " + hand.get(0));
		}

	}

	public int calculateHand() {
		int total = 0;
		for (CardBuilder cardBuilder : hand) {
			total = total + cardBuilder.getRank().getValue();
		}
		return total;
	}
	
	public void clearHand(){
		hand = new ArrayList<>();
	}

}
