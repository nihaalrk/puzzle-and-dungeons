package com.example.puzzleanddungeons.models.moves;

import java.util.List;

public class OrbSkyfall extends Move {

	private int numTurns;
	// 1 - increase rate, 2 - only these orbs
	private int type;
	private List<Integer> orbs;
	private double percentIncrease;
	
	public int getNumTurns() {
		return numTurns;
	}
	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public List<Integer> getOrbs() {
		return orbs;
	}
	public void setOrbs(List<Integer> orbs) {
		this.orbs = orbs;
	}
	public double getPercentIncrease() {
		return percentIncrease;
	}
	public void setPercentIncrease(double percentIncrease) {
		this.percentIncrease = percentIncrease;
	}
	
}
