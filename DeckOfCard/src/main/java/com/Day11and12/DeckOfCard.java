package com.Day11and12;

/**
 * Hello world!
 *
 */
public class DeckOfCard 
{
    public static void main( String[] args )
    {
    	String [] deck = new String[52];
	    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	    int start = 0, end = 12, j1 = 0;
		for (int i = 0; i < 4; i++)
		{
		  for (int j = start; j <= end; j++)
		  {
			deck[j] = suits[i] + " " + ranks[j1];
			j1++;
		  }
			j1 = 0;
			start = end + 1;
			end += 13;
		}
		for (int i = 0; i < deck.length; i++)
		{
		      int index = (int)(Math.random() * deck.length);
		      String temp = deck[i];
		      deck[i] = deck[index];
		      deck[index] = temp;
		 }
		      int j2 = 0;
		for (int i = 0; i < 4; i++) 
		{
			  System.out.print("For Player " + i + ": \n");
		for (int j = 0; j < 9; j++) 
		{
              System.out.print(deck[j2] + "-->");
			  j2++;
					
		}
			  System.out.println();
	}

}

}

