package com.puzzleanddungeons.models.moves;

public class Rage extends Move {

	private int numTurns;
	private double atkMult;
	
	public int getNumTurns() {
		return numTurns;
	}
	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}
	public double getAtkMult() {
		return atkMult;
	}
	public void setAtkMult(double atkMult) {
		this.atkMult = atkMult;
	}
	
}
