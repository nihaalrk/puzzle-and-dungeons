package com.example.puzzleanddungeons.models.moves;

public class Tape extends Move {

	private OrbsTargeted orbsTargeted;
	private int numTurns;
	
	public OrbsTargeted getOrbsTargeted() {
		return orbsTargeted;
	}
	public void setOrbsTargeted(OrbsTargeted orbsTargeted) {
		this.orbsTargeted = orbsTargeted;
	}
	public int getNumTurns() {
		return numTurns;
	}
	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}
	
}
