/**
 * 
 */
package com.hashedin.bjgame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List; //import java.util.Random;
import java.util.Map;
import java.util.Scanner;

/**
 * @author somit
 * 
 */
public class PlayGame {
	
	// private static BJGame jack = new BJGame();
	public static void main(String[] args) {
		String userInput;
		do {
			Game();
			System.out.println("PLay More??");
			Scanner scan = new Scanner(System.in);
			userInput = scan.nextLine();
		} while ("Y".equalsIgnoreCase(userInput));
		System.exit(0);
	}

	public static void Game() {
		public static final int OTHERACEVALUE=11;
		Map<String,Integer >cardPoints=new HashMap<String,Integer>();
		cardPoints.put("Ace",1);
		cardPoints.put("King",10);
		cardPoints.put("Queen",10);
		cardPoints.put("Jack",10);
		cardPoints.put("2",2);
		cardPoints.put("3",3);
		cardPoints.put("4",4);
		cardPoints.put("5",5);
		cardPoints.put("6",6);
		cardPoints.put("7",7);
		cardPoints.put("8",8);
		cardPoints.put("9",9);
		cardPoints.put("10",10);
		Scorer scoreCalculator=new SimpleScorer(OTHERACEVALUE);
		Deck deck=new Deck();
		Dealer dealer=new Dealer(deck);
		System.out.println("Welcome to Bellagio BlackJack Arena.Take seats");
		System.out.println("Ready to Play-- Enter number of players");
		Scanner scan = new Scanner(System.in);
		int playernumber = scan.nextInt();
		List<Player> playerList = new ArrayList<Player>();
		for (int i = 0; i < playernumber; i++) {
			Player players = new Player();
			System.out.print("\nEnter Name: ");
			scan = new Scanner(System.in);
			String name = scan.nextLine();
			players.setName(name);
			playerList.add(players);
		}
		Card cardPulled;
		for (Player player : playerList) {
			System.out.println(player.getName() + " your cards are:");
			cardPulled=dealer.giveCard(deck);
			(player.getCards()).add(cardPulled);
			cardPulled=dealer.giveCard(deck);
		}
		Player cpu = new Player();
		cpu.setName("CpuDaddy");
		System.out.println(cpu.getName() + " your cards are:");
		dealer.giveCard(deck);
		dealer.giveCard1(deck);

		int max = 0;
		for (Player pl : playerList) {
			System.out.println(pl.getName() + " Do you want to hit(Y\\N)?");
			scan = new Scanner(System.in);
			String userOption = scan.nextLine();
			while ("Y".equalsIgnoreCase(userOption) && pl.getScore() < 21) {
				jack.giveCard(pl);
				if (pl.getScore() > 21) {
					System.out.println(pl.getName() + " you loose? Yes");
					// continue;
				}
				if (pl.getScore() < 21) {
					System.out.println("Do you want to hit(Y\\N)?");
					scan = new Scanner(System.in);
					userOption = scan.nextLine();
				}
			}
			max = (pl.getScore() > max) && (pl.getScore() <= 21) ? pl
					.getScore() : max;
		}
		int state = 0, range = 17;
		System.out.println("dealer game starts");
		System.out.println("Dealer's cards from 2nd position: "
				+ jack.getval(dealer.getCards().get(1)));
		int dealerScore = dealer.getScore();
		if (dealerScore > max) {
			System.out.println("Dealer Wins with score" + dealerScore);
			state = 3;
		}

		if (state != 3) {
			dealerScore = dealer.getScore();
			while (dealerScore < range) {
				jack.giveCard(dealer);
				dealerScore = dealer.getScore();
			}
			if (dealerScore > 21 || dealerScore < max) {
				state = 2;
			} else if (dealerScore > max) {
				System.out.println("CPU Daddy Wins Wins");
			} else if (dealerScore == max) {
				state = 1;
			}

			System.out.println("winners are");
			if (state == 1) {
				System.out.println(dealer.getName());
			}
			if (state == 2 || state == 1) {
				for (Player pl : playerList) {
					if (pl.getScore() == max) {
						System.out.println(pl.getName());
					}
				}
			}
		}
	}
}