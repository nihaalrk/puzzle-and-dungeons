package com.puzzleanddungeons.models.moves;

import java.util.List;

public class OrbsUnmatchable extends Move {

	private List<Integer> orbs;
	// if it's just picking a random attribute:
	private int numAttributes;
	private int numTurns;
	
	public List<Integer> getOrbs() {
		return orbs;
	}
	public void setOrbs(List<Integer> orbs) {
		this.orbs = orbs;
	}
	public int getNumAttributes() {
		return numAttributes;
	}
	public void setNumAttributes(int numAttributes) {
		this.numAttributes = numAttributes;
	}
	public int getNumTurns() {
		return numTurns;
	}
	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}
	
}
