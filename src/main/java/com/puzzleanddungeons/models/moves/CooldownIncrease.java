package com.puzzleanddungeons.models.moves;

public class CooldownIncrease extends Move {

	private int minTurns;
	private int maxTurns;
	
	public int getMinTurns() {
		return minTurns;
	}
	public void setMinTurns(int minTurns) {
		this.minTurns = minTurns;
	}
	public int getMaxTurns() {
		return maxTurns;
	}
	public void setMaxTurns(int maxTurns) {
		this.maxTurns = maxTurns;
	}
	
}
