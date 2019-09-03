package com.puzzleanddungeons.models.moves;

public class DamageAbsorb extends Move {

	private long threshold;
	private int numTurns;
	
	public long getThreshold() {
		return threshold;
	}
	public void setThreshold(long threshold) {
		this.threshold = threshold;
	}
	public int getNumTurns() {
		return numTurns;
	}
	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}
	
}
