package com.skilldistillery.games.cards;

import java.util.Scanner;

public class BlackJackGameLogic {
	private Dealer dealer = new Dealer();
	private Player player = new Player();
	Scanner input = new Scanner(System.in);

	public void gameLogic() {


		System.out.println("The Game Will Start " + "\n");
		System.out.print("Enter your name: ");
		player.setName(input.next());
		
		game();
	}
	
	public void game() {
		System.out.println("The Game Will Start " + "\n");
		dealer.shuffleDeck();
		player.addCardTohand(dealer.dealCardsToPlayer(2));
		dealer.addCardTohand(dealer.dealCardsToPlayer(2));
		player.printHand();
		dealer.printHand("");
		System.out.println(player.getName() + ": " + player.calculateHand());
		checkWinConditions();
		playerOptions();

	}

	public void checkWinConditions() {
		if (player.calculateHand() == 21 && dealer.calculateHand() < 21) {
			System.out.println(player.getName() + " wins");
			goAgain();
		}
		if (dealer.calculateHand() == 21 && player.calculateHand() < 21) {
			System.out.println("Dealer wins");
			goAgain();
		}
		if (dealer.calculateHand() == 21 && player.calculateHand() == 21) {
			System.out.println("Push");
			goAgain();
		}
		if (player.calculateHand() > 21) {
			System.out.println("Dealer Wins");
			goAgain();
		}
		if (dealer.calculateHand() > 21) {
			System.out.println(player.getName() + " Wins");
			goAgain();
		}

	}

	public void dealerBehavior() {
		dealer.printHand("ALL");
		Boolean keepGoing = true;
		while (keepGoing) {
			if (dealer.calculateHand() > player.calculateHand()) {
				System.out.println("Dealer Total: " + dealer.calculateHand());
				System.out.println("Dealer Wins");
				goAgain();
			}
			if (dealer.calculateHand() <= 17) {
				dealerHit();
				System.out.println("Dealer Total: " + dealer.calculateHand());
				checkWinConditions();
			}
		}
	}

	public void goAgain() {
		Scanner input = new Scanner(System.in);
		String choice;
		System.out.println("Go Again (Y/N)? ");
		choice = input.next();
		if (choice.equalsIgnoreCase("Y")) {
			player.clearHand();
			dealer.clearHand();
			if(dealer.getDeck().getCardsDeck().size()<10){
				dealer.getDeck().buildDeck();
			}
			game();
		} else {
			quit();
		}
		input.close();
	}

	public void quit() {
		Boolean keepGoing = false;
		while (keepGoing) {
			break;
		}
	}

	public void playerHit() {
		player.addCardTohand(dealer.dealCardsToPlayer(1));
		player.printHand();
		System.out.println(player.getName() + " total: " + player.calculateHand());
		checkWinConditions();
		playerOptions();
	}

	public void dealerHit() {
		dealer.printHand("ALL");
		dealer.addCardTohand(dealer.dealCardsToPlayer(1));

	}

	public void playerOptions() {
		Scanner input = new Scanner(System.in);
		System.out.print(player.getName() + "\n1. Hit " + "\n2. Stay ");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			playerHit();
			break;
		default:
			dealerBehavior();
			break;
		}

		input.close();
	}

}
