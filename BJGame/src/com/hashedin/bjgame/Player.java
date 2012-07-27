/**
 * 
 */
package com.hashedin.bjgame;

import java.util.ArrayList;
import java.util.List;

/**
 * @author somit
 *@since 01 AD
 */
public class Player {
	private String name;
	private List<Card> cardsListofPlayers = new ArrayList<Card>();
	private int score;
	/**
	 * @return the name
	 */
	public void addToList(Card card){
		cardsListofPlayers.add()
	}
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the cards
	 */
	public List<Card> getCards() {
		return cards;
	}
	/**
	 * @param cards the cards to set
	 */
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
}

