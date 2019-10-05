package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cars.common.Card;
import com.skilldistillery.cars.common.Hand;

public class Player {

	private Hand hand = new BlackJackHand();

	public Player() {
	}

	public Player(Hand hand) {

		this.setHand(hand);
	}

	public void addCard(Card card) {

		hand.addCard(card);
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {

		this.hand = hand;
	}

	public void clearHand() {

		hand.clear();
	}

	public int getHandValue() {

		return hand.getHandValue();

	}
	
	public boolean isBlackJack() {
		
		return hand.isBlackJack();
		
	}

}
