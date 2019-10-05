package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cars.common.Card;
import com.skilldistillery.cars.common.Deck;

public class Casino {

	// F I E L D S
	private Dealer dealer = new Dealer();
	private Player player = new Player();
	private Deck deck = new Deck();

	// M E T H O D S
	public static void main(String[] args) {

		Casino cas = new Casino();
		cas.launch();

	}

	public void launch() {
		Scanner scanner = new Scanner(System.in);

		player.clearHand();
		dealer.clearHand();
		introduction(scanner);
		scanner.close();

	}

	public void introduction(Scanner scanner) {

		System.out.println("Are you ready to play? ( Y/ N )");

		String input = scanner.nextLine();
		if (input.equalsIgnoreCase("y")) {
			dealFirstHandCards(scanner);
		} else {
			System.out.println("Thanks for stopping by");
			System.exit(1);
		}
	}

	public void dealFirstHandCards(Scanner scanner) {

		deck.shuffleDeck();

		for (int i = 0; i < 4; i++) {

			if (i % 2 == 0) {

				dealer.addCard(dealCard());

			}

			else {

				player.addCard(dealCard());

			}

		}

		if (player.isBlackJack() == true) {

			printBothValuesAndHands();
			System.out.println("+++++++Player   BlackJack!++++++++\n");
			launch();

		}
		if (dealer.isBlackJack() == true) {
			printBothValuesAndHands();
			System.out.println("++++++Dealer   BlackJack!+++++++++++++\n");
			launch();

		} else

			cardsRemaining();
		printPlayerValues();
		menu(scanner);

	}

	public void menu(Scanner scanner) {

		System.out.println("What would you like to do?");
		System.out.println("1. Hit");
		System.out.println("2. Stay");

		int userChoice = scanner.nextInt();

		switch (userChoice) {
		case 1:
			hit(scanner);
			break;
		case 2:
			stay(scanner);
			break;

		default:
			menu(scanner);
			break;
		}

	}

	public void hit(Scanner scanner) {

		player.addCard(dealCard());
		printPlayerValues();
		checkPlayerValues();
		menu(scanner);

	}

	public void stay(Scanner scanner) {

		System.out.println("Dealer has revealed his hand ");
		checkDealerValues();
		checkPlayerValues();
		printBothValuesAndHands();
		checkForWinner();

	}

	public Card dealCard() {

		return deck.dealCard();

	}

	public void checkPlayerValues() {

		if (player.getHandValue() > 21) {
			System.out.println("======================================");
			System.out.println("Player Busts! Dealer wins this round!\n");
			launch();
		}
		if (player.getHandValue() == 21) {
			System.out.println("==============================");
			System.out.println("Player reached 21! Player wins\n");
			launch();
		}

	}

	public void checkDealerValues() {

		while (dealer.getHandValue() < 17) {

			dealer.addCard(dealCard());

			if (dealer.getHandValue() > 21) {
				printBothValuesAndHands();
				System.out.println("Dealer Busts! You win this round!\n");
				launch();
			}
			if (dealer.getHandValue() == 21) {
				printBothValuesAndHands();
				System.out.println("Dealer got 21!\n");
				launch();
			}

		}
	}

	public void printBothValuesAndHands() {

		System.out.println("================================================");
		System.out.println("Player Value: \t" + player.getHandValue() + "\tHand: " + player.getHand());
		System.out.println("Dealer Value: \t" + dealer.getHandValue() + "\tHand: " + dealer.getHand());
		System.out.println("=================================================");
	}

	public void printPlayerValues() {

		System.out.println("==================================================");
		System.out.println("Player Value: " + player.getHandValue() + "\t Hand: " + player.getHand().toString());
		System.out.println("Dealer Value: " + dealer.getFirstValueDealer() + "\t Hand: " + dealer.getSingleHand());
		System.out.println("==================================================");

	}

	public void checkForWinner() {

		System.out.println("==========================");
		if (player.getHandValue() > dealer.getHandValue()) {
			System.out.println("Player wins this round!\n");
		} else if (player.getHandValue() == dealer.getHandValue()) {
			System.out.println("Draw!");

		} else {
			System.out.println("Dealer wins this round!\n");
		}
		launch();

	}

	public void cardsRemaining() {

		System.out.println("--------------------NEW ROUND---------------------");
		System.out.println(deck.checkDeckSize() + " Cards Remaining");

	}

}
