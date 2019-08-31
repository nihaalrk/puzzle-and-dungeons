package com.example.puzzleanddungeons.models.moves;

public class VoidDamage extends Move {

	private int numTurns;
	private long threshold;
	
	public int getNumTurns() {
		return numTurns;
	}
	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}
	public long getThreshold() {
		return threshold;
	}
	public void setThreshold(long threshold) {
		this.threshold = threshold;
	}
	
}
