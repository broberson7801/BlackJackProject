package com.skilldistillery.games.cards;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<CardBuilder> hand = new ArrayList<>();
	private String name;
	private double money;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void printHand() {
		for (CardBuilder cardBuilder : hand) {
			System.out.println(name + ": " + cardBuilder);
		}
	}

	public Player(List<CardBuilder> hand, String name, double money) {
		super();
		this.hand = hand;
		this.name = name;
		this.money = money;
	}

	public List<CardBuilder> getHand() {
		return hand;
	}

	public void setHand(List<CardBuilder> hand) {
		this.hand = hand;
	}
	
	public void addCardTohand(List<CardBuilder> cards) {
		hand.addAll(cards);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	public int calculateHand(){
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
