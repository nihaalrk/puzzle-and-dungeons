package com.puzzleanddungeons.models.moves;

public class AttributeShield extends Move {

	private int attribute;
	private int numTurns;
	
	public int getAttribute() {
		return attribute;
	}
	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}
	public int getNumTurns() {
		return numTurns;
	}
	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}

}
