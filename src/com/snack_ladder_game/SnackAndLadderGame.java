package com.snack_ladder_game;
/*
 * -----------------------Snack & Ladder Game-----------------------
 * -> Print Welcome message
 * -> Generate random Num from 1 to 6
 * -> The Player checks for a Option. They are No Play, Ladder or Snake.
 * -> Repeat till the Player reaches the winning position 100.
 * */

public class SnackAndLadderGame { 
	static final int noPlay = 0;
	static final int ladder = 1;
	static final int snack = 2;
	static final int winningPoition = 100;
	static final int minimumPosition = 0;
	
	public static int getRandomNum() {
		int randomNum =  (int) ((Math.random() * 6) + 1);
		return randomNum;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Snack & Ladder Game..|");
		int positionA = 0;
		int noOfDice = 0;
		//System.out.println(getRandomNum());
		int dice = getRandomNum();
		
		while (positionA < winningPoition) {
			noOfDice++;
			int checkPlay = (int) Math.floor(Math.random()*10)%3;
			
			switch (checkPlay) {
			case noPlay :
				//System.out.println("Player stay same position..|");
				break;
				
			case ladder :
				positionA = positionA + dice;
				if(positionA > winningPoition) {
					positionA = positionA - dice;
				}
				//System.out.println(positionA);
			//System.out.println("Player Moved ahead..|");
				break;
	
			case snack:
				positionA = positionA - dice;
				//System.out.println("Player Moved behind..|");
				break;
			}
		}
		System.out.println(positionA);
		System.out.println("No of times Dice rolled to Win game:-> " + noOfDice);
		System.out.println("U Won.");
	}
}
