package com.skilldistillery.games.cards;

class CardBuilder {

	CardSuit suit;
	CardRank rank;

	public CardBuilder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CardBuilder(CardSuit suit, CardRank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}

	public CardSuit getSuit() {
		return suit;
	}

	public void setSuit(CardSuit suit) {
		this.suit = suit;
	}

	public CardRank getRank() {
		return rank;
	}

	public void setRank(CardRank rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return rank + " " + suit;
	}

}
