/**
 * 
 */
package com.hashedin.bjgame;

import java.util.List;
import java.util.Map;

/**
 * @author somit
 *
 */
public interface Scorer {
	public int playerScore(List<Card> cardlist, Map<String, Integer> cardPoints);
	
}