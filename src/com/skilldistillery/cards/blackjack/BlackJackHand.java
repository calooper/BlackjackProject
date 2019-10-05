package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cars.common.Card;
import com.skilldistillery.cars.common.Hand;

public class BlackJackHand extends Hand {

	public BlackJackHand() {

	}

	@Override
	public int getHandValue() {

		int playerValue = 0;

		for (Card card : getCards()) {

			playerValue += card.getValue();

		}
		return playerValue;

	}

	public int getSingleValue() {

		return getCards().get(0).getValue();

	}

	public boolean isBlackJack() {

		if (getHandValue() == 21) {
			return true;
		}

		return false;

	}

	public void clear() {
		
		getCards().removeAll(getCards());

	}

}
