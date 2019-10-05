package com.skilldistillery.cars.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	//F I E L D
	private List<Card> cards = new ArrayList<>();

	// C O N S T R U C T O R S
	public List<Card> getCards() {

		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void addCard(Card card) {

		cards.add(card);

	}

	public int getSingleCardValue() {

		return cards.get(1).getValue();

	}

	public abstract void clear();

	public abstract int getHandValue();
	
	public abstract boolean isBlackJack();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(cards);
		return builder.toString();
	}

}
