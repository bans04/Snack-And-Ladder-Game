package com.snack_ladder_game;
/*
 * -----------------------Snack & Ladder Game-----------------------
 * -> Print Welcome message
 * 
 * */

public class SnackAndLadderGame {
	public static int getRandomNum() {
		int randomNum =  (int) ((Math.random() * 6) + 1);
		return randomNum;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Snack & Ladder Game..|");
		int startPosition;
		System.out.println(getRandomNum());
	}
}
