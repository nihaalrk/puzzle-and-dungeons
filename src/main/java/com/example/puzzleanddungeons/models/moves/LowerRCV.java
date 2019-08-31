package com.example.puzzleanddungeons.models.moves;

public class LowerRCV extends Move {

	private int numTurns;
	private double percentDecrease;
	
	public int getNumTurns() {
		return numTurns;
	}
	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}
	public double getPercentDecrease() {
		return percentDecrease;
	}
	public void setPercentDecrease(double percentDecrease) {
		this.percentDecrease = percentDecrease;
	}
	
}
