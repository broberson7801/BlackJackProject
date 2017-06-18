package com.skilldistillery.games.cards;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DealerTest {
	Dealer dealer;

	@Before
	public void setUp() throws Exception {
		dealer = new Dealer();
	}

	@After
	public void tearDown() throws Exception {
		dealer = null;
	}

	@Test
	public void test_method_shuffleDeck_for_deck_randomization() {
		// Test will fail if assertEquals
		String before = dealer.getDeck().toString();
		dealer.shuffleDeck();
		String after = dealer.getDeck().toString();
		assertNotEquals(before, after);

	}

	@Test
	public void test_method_reoveCards_for_removal_of_cards_from_the_deck() {
		// Test will fail if assert Equals
		String before = dealer.getDeck().toString();
		dealer.dealCards(4);
		String after = dealer.getDeck().toString().toString();
		assertNotEquals(before, after);
	}

}
