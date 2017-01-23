package com.opusmagus.entity;

public class Ball {

	public int LastXPos;
	public int LastYPos; 
	public int NewXPos; 
	public int NewYpos;
	public Player Owner;
	
	public Ball(int lastXPos, int lastYPos, int newXPos, int newYpos) {
		LastXPos = lastXPos;
		LastYPos = lastYPos;
		NewXPos = newXPos;
		NewYpos = newYpos;
	}

}
