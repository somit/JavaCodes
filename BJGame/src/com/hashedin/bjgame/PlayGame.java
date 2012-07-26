/**
 * 
 */
package com.hashedin.bjgame;

import java.util.ArrayList;
import java.util.List;
//import java.util.Random;
import java.util.Scanner;

/**
 * @author somit
 * 
 */
public class PlayGame {
private static String userInput;
	//private static BJGame jack = new BJGame();
	public  static void main(String[] args) {
		do
		{
		    Game();
			System.out.println("PLay More??");
			Scanner scan=new Scanner(System.in);
			userInput=scan.nextLine();
			}
			while("Y".equalsIgnoreCase(userInput));	
		System.exit(0);
	}
	public static void Game()
	{
//		do	
//		{
		BJGame jack=new BJGame();
		System.out.println("Welcome to Bellagio BlackJack Arena.Take seats");
		System.out.println("Ready to Play-- Enter number of players");
		Scanner scan = new Scanner(System.in);
		int playernumber = scan.nextInt();

		Player player = null;
		List<Player> playerList = new ArrayList<Player>();
		for (int i = 0; i < playernumber; i++) {
			player = new Player();
			System.out.print("\nEnter Name: ");
			scan = new Scanner(System.in);
			String name = scan.nextLine();
			player.setName(name);
			playerList.add(player);
		}
		for (Player pl : playerList) {
			System.out.println(pl.getName() + " your cards are:");
			jack.giveCard(pl);
			jack.giveCard(pl);
		}
		Player dealer = new Player();
		dealer.setName("CpuDaddy");
		System.out.println(dealer.getName() + " your cards are:");
		jack.giveCard(dealer);
		dealer.getCards().add(jack.getCard());
		dealer.setScore(jack.totalScore(dealer.getCards()));

		int max = 0;
		for (Player pl : playerList) {
			System.out.println(pl.getName() + " Do you want to hit(Y\\N)?");
			scan = new Scanner(System.in);
			String userOption = scan.nextLine();
			while ("Y".equalsIgnoreCase(userOption) && pl.getScore() < 21) {
				jack.giveCard(pl);
				if (pl.getScore() > 21) {
					System.out.println(pl.getName() + " you loose? Yes");
					//continue;
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
		int state = 0, range=17;
		System.out.println("dealer game starts");
		System.out.println("Dealer's cards from 2nd position: "
				+ jack.getval(dealer.getCards().get(1)));
		int dealerScore = dealer.getScore();
		if (dealerScore > max) {
			System.out.println("Dealer Wins with score"+ dealerScore);
			state=3;
		}
		
//		Random generator = new Random();
//		do {
//			range = generator.nextInt(20);
//		} while (range < 17);
		if(state!=3)
		{
		dealerScore = dealer.getScore();
		while(dealerScore<range)
		{
			jack.giveCard(dealer);
			dealerScore = dealer.getScore();
		}
		if(dealerScore>21 || dealerScore<max)
			{
			state=2;
			}
		else if(dealerScore>max)
		{
			System.out.println("CPU Daddy Wins Wins");
		}
		else if(dealerScore==max)
			{
			state=1;
			}
		
		
		System.out.println("winners are");
		if (state == 1) 
		{
			System.out.println(dealer.getName());
		}
		if (state == 2 || state == 1) 
		{
			for (Player pl : playerList) 
			{
				if (pl.getScore() == max) 
				{
					System.out.println(pl.getName());
				}
			}
		}
		}
		}


		
//	System.out.println("PLay More??");
//	Scanner scan=new Scanner(System.in);
//	String userOp=scan.nextLine();
//		}
//	while("Y".equalsIgnoreCase(userOp));
//	
}

//	private static void giveCard(Player player) {
//	int k = jack.getCard();
//	player.getCards().add(k);
//	player.setScore(jack.totalScore(player.getCards()));
//	System.out.println(jack.getval(k));
//}
	
	/*while (true) {
	if (dealerScore == 21 && max == 21) {
		state = 1;
		break;
	}
	if (dealerScore >= range && max > dealerScore) {
		state = 2;
		break;
	}
	if (dealerScore < max && dealerScore < range) {
		giveCard(dealer);
		dealerScore = dealer.getScore();
	}
	if (dealerScore > 21) {
		state = 2;
		break;
	}
	if (dealerScore > max) {
		System.out.println("Dealer Wins");
		System.exit(0);
	}
	if (dealerScore == max && dealerScore > range && max != 21) {
		state = 1;
		break;
	}
}*/