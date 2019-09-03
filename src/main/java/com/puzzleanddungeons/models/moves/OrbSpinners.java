package com.puzzleanddungeons.models.moves;

public class OrbSpinners extends Move {

	private OrbsTargeted orbsTargeted;
	private int numOrbs;
	private int numTurns;
	private double spinRate;
	
	public OrbsTargeted getOrbsTargeted() {
		return orbsTargeted;
	}
	public void setOrbsTargeted(OrbsTargeted orbsTargeted) {
		this.orbsTargeted = orbsTargeted;
	}
	public int getNumOrbs() {
		return numOrbs;
	}
	public void setNumOrbs(int numOrbs) {
		this.numOrbs = numOrbs;
	}
	public int getNumTurns() {
		return numTurns;
	}
	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}
	public double getSpinRate() {
		return spinRate;
	}
	public void setSpinRate(double spinRate) {
		this.spinRate = spinRate;
	}
	
}
