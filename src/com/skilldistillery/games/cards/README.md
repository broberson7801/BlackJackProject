#BlackJackProject
##Week 3 Project
### Bryan roberson


About the program:

As of this update, the program treats Ace's as eleven. There may be some JUIT test
cases with this program -please ignore them. I initially attempted to build tests with my methods and classes, but I kept changing things over and over, and stopped doing the tests altogether.

About developing the program:

The biggest setback encountered was figuring out how to add the cards I removed from the deck to the hands. Aaron helped in this regard, as well as help me better understand what return statements do when you don't have a field set to accept the return. 

Overall, I have eight classes for this program. I wanted the cards to be just cards,
the deck to be just a deck, and so forth. In my BlackJackGameLogic class, I have methods calling methods as to keep repeat work as low as possible. I also did my best to keep method cohesion up by making the methods only do one job. I'm not entirely sure if I pulled of method cohesion in this program.

Additionally for the card and deck classes, I attempted to keep the coupling as low as possible, though the deck class ultimately relies on the card class for the deck to be built; likewise, the card class relies on the rank and suit enum classes, and same for the dealer relying on the deck class for a deck. The player class, fortunately, is just a player. 

The dual value of the Ace may or may may not be implemented by the deadline; same goes for multiple players. 
