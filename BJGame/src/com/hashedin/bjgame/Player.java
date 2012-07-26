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
	private List<Integer> cards = new ArrayList<Integer>();
	private int score;

	/**
	 * @return the cards
	 */
	public List<Integer> getCards() {
		return cards;
	}

	/**
	 * @param cards
	 *            the cards to set
	 */
	public void setCards(List<Integer> cards) {
		this.cards = cards;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
