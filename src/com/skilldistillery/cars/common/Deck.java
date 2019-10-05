package com.skilldistillery.cars.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cardList;

	public Deck() {

		cardList = createDeck();

	}

	private List<Card> createDeck() {
		cardList = new ArrayList<>(52);

		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				cardList.add(new Card(s, r));
			}

		}

		return cardList;
	}

	public int checkDeckSize() {

		return cardList.size();

	}

	public Card dealCard() {

		Card card = cardList.remove(0);
		
		return card;

	}

	public void shuffleDeck() {

		Collections.shuffle(cardList);

	}
	
	public int size() {
		return 0;
		
	}

}
