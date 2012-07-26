/**
 * 
 */
package com.hashedin.bjgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author somit
 *
 */
public class BJGame {

	//private List<Player> players=new ArrayList<Player>();
	private int cards[];
	
	public BJGame(){
		cards=new int[53];
		cards[0]=0;
		for(int i=1;i<=52;i++)
		{
			cards[i]=1;
		}
	}
	
	public int getscore(int i)
	{	i=i%13;
	   if(i==0 || i>=10) return 10;
	   return i;
		
	}
	public String getval(int i)
	{
		
		
		i=i%13;
	   if(i==1) return "A";
	   if(i==11) return "K";
	   if(i==12) return "Q";
	   if(i==0) return "J";
	   return (""+i);
	}
	public int getCard()
	{
		Random generator = new Random();
		int index=0;int num;
		do {
		index = generator.nextInt( 52 );
		} while(cards[index]==0);
		num=index+1;
		cards[num]=0;
		return num;
	}
	public int totalScore(List<Integer> input)
	{
		int sum=0,k=0;
		for (Integer val : input) {
			sum=sum+getscore(val);
			if(getscore(val)==1){
				k++;
			}
		}
		while(sum<21 && (sum+10)<21 && --k>0){
			sum=sum+10;
		}
		return sum;
	}
	
	public void giveCard(Player player) {
		int k = getCard();
		player.getCards().add(k);
		player.setScore(totalScore(player.getCards()));
		System.out.println(getval(k));
	}
//	/**
//	 * @return the players
//	 */
//	public List<Player> getPlayers() {
//		return players;
//	}
//
//	/**
//	 * @param players the players to set
//	 */
//	public void setPlayers(List<Player> players) {
//		this.players = players;
//	}
	
}
