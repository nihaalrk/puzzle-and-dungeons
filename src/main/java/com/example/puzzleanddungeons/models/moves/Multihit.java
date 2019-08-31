package com.example.puzzleanddungeons.models.moves;

// called Multi-hit but could just be a singular hit
public class Multihit extends Move {

	private int numHits;

	public int getNumHits() {
		return numHits;
	}

	public void setNumHits(int numHits) {
		this.numHits = numHits;
	}
	
}
