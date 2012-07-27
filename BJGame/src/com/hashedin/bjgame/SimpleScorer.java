package com.hashedin.bjgame;

import java.util.List;
import java.util.Map;

public class SimpleScorer implements Scorer {
	private int otherValue;

	SimpleScorer(int otherValue) {
		this.otherValue = otherValue;
	}

	public int playerScore(List<Card> cardlist, Map<String, Integer> cardPoints) {
		int score = 0;
		int sum = 0;
		int k = 0;
		for (Card eachcard : cardlist) {
			int point = cardPoints.get(eachcard.getRanks(eachcard.getRank()));
			sum = sum + point;
			if (point == 1) {
				k++;
			}
		}
		while (sum < 21 && (sum + (otherValue - 1) < 21) && --k > 0) {
			sum = sum + otherValue - 1;
		}
		return score;
	}

}
