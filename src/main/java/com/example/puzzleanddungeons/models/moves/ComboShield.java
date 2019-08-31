package com.example.puzzleanddungeons.models.moves;

public class ComboShield extends Move {
	
	// absorbs combos <= to this value
	private int numCombos;
	private int numTurns;
	
	public int getNumCombos() {
		return numCombos;
	}
	public void setNumCombos(int numCombos) {
		this.numCombos = numCombos;
	}
	public int getNumTurns() {
		return numTurns;
	}
	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}
	
}
