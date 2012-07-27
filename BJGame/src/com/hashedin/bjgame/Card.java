package com.hashedin.bjgame;

public class Card {
	private int suit;
	private int rank;
	private static String[] suits= { "hearts", "spades", "diamonds", "clubs" };
	private static String[] ranks={"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

	Card(int suit,int rank){
		this.rank=rank;
		this.suit=suit;
	}
	@Override
	public String toString()
	    {
	          return ranks[rank] + " of " + suits[suit];
	    }
	/**
	 * @return the suit
	 */
	public int getSuit() {
		return suit;
	}
	/**
	 * @param suit the suit to set
	 */
	public void setSuit(int suit) {
		this.suit = suit;
	}
	/**
	 * @return the rank
	 */
	public int getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}
  public String getRanks(int rank)
  {
	  return ranks[rank];
  }

}