package com.puzzleanddungeons.models.moves;

public class SetMaxHP extends Move {

	private int numTurns;
	private int hpValue;
	
	public int getNumTurns() {
		return numTurns;
	}
	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}
	public int getHpValue() {
		return hpValue;
	}
	public void setHpValue(int hpValue) {
		this.hpValue = hpValue;
	}
	
}
