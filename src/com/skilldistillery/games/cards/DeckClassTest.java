package com.skilldistillery.games.cards;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DeckClassTest {
	Deck deck;
	@Before
	public void setUp() throws Exception {
		deck = new Deck();
	}

	@After
	public void tearDown() throws Exception {
		deck = null;
				
	}

	@Test
	public void test_method_buildDeck_for_adding_fifty_two_cards() {
		deck.buildDeck();
		assertEquals(52, deck.getCardsDeck().size());
		
	}

}
