package com.hashedin.bjgame;

public class Dealer {

	Dealer(Deck deck) {
		int[] array;
		Card card[] = new Card[52];
		array = new int[52];
		for (int i = 0; i < 52; i++) {
			array[i] = i;
		}
		Shuffle shuff = new KnuthShuffle();
		array = shuff.shuffle(array);
		for (int i = 0; i < 52; i++) {
			card[i] = deck.getCards(array[i]);
		}
		deck.setCards(card);

	}

	public Card giveCard(Deck deck) throws IllegalArgumentException {
		if (deck.getTotalCards() == 0)
			throw new IllegalArgumentException("No cards Remaing");
		{
			Card pulledCard = deck.getCard();
			// player.getCards().add(k);
			// player.setScore(totalScore(player.getCards()));
			System.out.println(pulledCard);
			return pulledCard;
		}
	}

	public Card giveCard1(Deck deck) throws IllegalArgumentException {
		if (deck.getTotalCards() == 0)
			throw new IllegalArgumentException("No cards Remaing");
		{
			Card pulledCard = deck.getCard();
			// player.getCards().add(k);
			// player.setScore(totalScore(player.getCards()));
			return pulledCard;
		}
	}
}
