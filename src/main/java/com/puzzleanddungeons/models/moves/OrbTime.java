package com.puzzleanddungeons.models.moves;

public class OrbTime extends Move {

	private int numTurns;
	private int numSecs;
	private double pctReduction;
	
	public int getNumTurns() {
		return numTurns;
	}
	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}
	public int getNumSecs() {
		return numSecs;
	}
	public void setNumSecs(int numSecs) {
		this.numSecs = numSecs;
	}
	public double getPctReduction() {
		return pctReduction;
	}
	public void setPctReduction(double pctReduction) {
		this.pctReduction = pctReduction;
	}
	
}
