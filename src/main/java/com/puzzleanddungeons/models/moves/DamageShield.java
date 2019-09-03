package com.puzzleanddungeons.models.moves;

public class DamageShield extends Move {

	private int numTurns;
	private double shieldStrength;
	
	public int getNumTurns() {
		return numTurns;
	}
	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}
	public double getShieldStrength() {
		return shieldStrength;
	}
	public void setShieldStrength(double shieldStrength) {
		this.shieldStrength = shieldStrength;
	}
	
}
