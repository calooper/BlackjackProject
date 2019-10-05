package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cars.common.Card;
import com.skilldistillery.cars.common.Hand;

public class Dealer extends Player {

	// F I E L D S
	private Hand hand = new BlackJackHand();

	// private Deck deck = new Deck();

	// C O N S T R U C T O R S
	public Dealer() {
	}

	public Dealer(Hand hand) {
		super(hand);
	}

	public void addCard(Card card) {

		hand.addCard(card);
	}

	public void clearHand() {
		
		hand.clear();
	}

	public Hand getHand() {
		return hand;
	}

	public Card getSingleHand() {
		return hand.getCards().get(1);
	}

	public int getHandValue() {

		return hand.getHandValue();
	}

	public int getFirstValueDealer() {

		return hand.getSingleCardValue();
	}

	public boolean isBlackJack() {

		return hand.isBlackJack();

	}

}
