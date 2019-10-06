package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cars.common.Card;
import com.skilldistillery.cars.common.Deck;
import com.skilldistillery.cars.common.Hand;
import com.skilldistillery.cars.common.Rank;
import com.skilldistillery.cars.common.Suit;

public class Tester {

	public static void main(String[] args) {
		List<Card> cards = new ArrayList<>();
		Player tester = new Player();
		Deck deck = new Deck();
		Hand hand = new BlackJackHand();
		Card card = null;

		for (int i = 0; i < 52; i++) {

			
			addCard(deck.dealCard());
		
			;System.out.println("-----");
			//System.out.println(card.getValue());
			
			
			//addCard(deck.dealCard());
		

			



		}

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tester [getHand()=");
		builder.append(getHand());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	private static Hand hand = new BlackJackHand();

	public Tester() {
	}

	public Tester(Hand hand) {

		this.setHand(hand);
	}

	public static void addCard(Card card) {

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

	public static int getHandValue() {

		return hand.getHandValue();

	}
	
	public int getCardValue() {
		
		return getCardValue();
		
	}

}
