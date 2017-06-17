package com.skilldistillery.games.cards;

import java.util.ArrayList;
import java.util.List;

class Deck {

	private List<CardBuilder> cardsDeck = new ArrayList<>();

	public List<CardBuilder> buildDeck() {

		for (CardSuit s : CardSuit.values()) {
			for (CardRank r : CardRank.values()) {
				cardsDeck.add(new CardBuilder(s, r));

			}
		}

		return cardsDeck;
	}

	public Deck(List<CardBuilder> cardsDeck) {
		super();
		this.cardsDeck = cardsDeck;
	}

	public Deck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<CardBuilder> getCardsDeck() {
		return cardsDeck;
	}

	public void setCardsDeck(List<CardBuilder> cardsDeck) {
		this.cardsDeck = cardsDeck;
	}

	@Override
	public String toString() {
		return cardsDeck.toString();
	}

}
