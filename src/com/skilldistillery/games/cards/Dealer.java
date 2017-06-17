package com.skilldistillery.games.cards;

import java.util.Collections;
import java.util.List;

public class Dealer {
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

	public List<CardBuilder> shuffleDeck() {
		Collections.shuffle(deck.getCardsDeck());
		return deck.getCardsDeck();
	}

	public List<CardBuilder> dealCards(int numCards) {
		deck.getCardsDeck().remove(numCards);
		return deck.getCardsDeck();
	}

}
