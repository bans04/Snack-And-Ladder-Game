package com.snack_ladder_game;
/*
 * -----------------------Snack & Ladder Game-----------------------
 * -> Print Welcome message
 * -> Generate random Num from 1 to 6
 * -> 
 * 
 * */

public class SnackAndLadderGame { 
	static final int noPlay = 0;
	static final int ladder = 1;
	static final int snack = 2;
	
	public static int getRandomNum() {
		int randomNum =  (int) ((Math.random() * 6) + 1);
		return randomNum;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Snack & Ladder Game..|");
		int startPosition = 0;
		//System.out.println(getRandomNum());
		int dice = getRandomNum();
		
		int checkPlay = (int) Math.floor(Math.random()*10)%3;
		switch (checkPlay) {
		case noPlay :
			System.out.println("Player stay same position..|");
			break;
			
		case ladder :
			startPosition = startPosition + dice;
			System.out.println("Player Moved ahead..|");
			break;

		case snack:
			startPosition = startPosition - dice;
			System.out.println("Player Moved behind..|");
			break;
		}
		System.out.println(startPosition);
	}
}
