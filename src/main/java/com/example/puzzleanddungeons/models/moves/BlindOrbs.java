package com.example.puzzleanddungeons.models.moves;

public class BlindOrbs extends Move {

	private OrbsTargeted orbsTargeted;
	private boolean revealable;
	private int numTurns;
	
	public OrbsTargeted getOrbsTargeted() {
		return orbsTargeted;
	}
	public void setOrbsTargeted(OrbsTargeted orbsTargeted) {
		this.orbsTargeted = orbsTargeted;
	}
	public boolean isRevealable() {
		return revealable;
	}
	public void setRevealable(boolean revealable) {
		this.revealable = revealable;
	}
	public int getNumTurns() {
		return numTurns;
	}
	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}
	
}
