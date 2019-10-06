## Overview
This project is a blackjack app that allows a user to play against
a dealer. The objective of this app is to improve upon designing
an objective-oriented program so that it mimics real-life chain-of-events.

The program first prompts a user if they want to play a round. If the
user decides to proceed, the user will be dealt two face-up cards, and the
dealer will be dealt two cards - one face-up, the other face-down. The user
will then be prompted to either hit or stay.

If the user stays, the dealer's second card will be shown and if it is under 17,
the dealer will draw a card until its value is higher than 17. If the
dealer doesn't get a 21 (win) or go over 21 (busts), the player with the higher
card value wins that round.

If the user decides to hit, the user will be dealt a card until he/ she decides
to stay, gets 21, or busts.

### Design
As mentioned, the program is designed to emulate real-life objects. The program
uses enums for its card ranks and card suits. There is a Casino class that runs
the program from a main method. When a user decides to play, a new player
object is created, and also a new dealer object - which is a subclass of the
player class.

After those objects are instantiated, a class called "deck", which contains
a List of 52 Card objects, is created and the shuffled. The Dealer and the User
are each dealt two cards that are then added to each of their own
BlackJackHands. Each player has their own BlackJackHand that holds a list of
cards. The BlackJackHand subclass inherits from an abstract class called Hand.
The idea is to divorce the common card classes from the blackjack classes by
putting each into their own packages - and so other card games can be created
using the Deck, Cards, and Hand classes.

### Struggles
The most difficult part of this program was the initial conceptualization
of how the objects are going to interact with each other. UML and sequential
diagrams were a huge help, but in hindsight I wish I would've taken a little
more time in the design phase to better grasp the flow process.

The logic behind the game was somewhat of a challenge, but mostly it was just
trying to create order in the logic by having methods reduce redundancy.
I think this project was a huge help in gaining experience using objects
as fields and designing a scalable object-oriented program.
