package com.hashedin.bjgame;

import java.util.Stack;

public class Deck {
	private Card[] cards;
	private int remainingCards;

	Deck() {
		
		remainingCards = 51;
		cards = new Card[52];
		int x = 0;
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 12; j++) {
				cards[++x] = new Card(i, j);

			}

		}
	}
	/**
	 * @param cards the cards to set
	 * @return 
	 */
	public Card getCards(int index) {
		return cards[index];
	}
	public void setCards(Card[] cards){
		this.cards=cards;
	}
	public Card getCard() {
		Card num = cards[51-remainingCards];
		cards[51-remainingCards] = null;
		remainingCards --;
		return num;
	}

	public int getTotalCards() {
		return remainingCards;
	}
}
