package com.example.puzzleanddungeons.models.moves;

import java.util.List;

public class LockedOrbSkyfall extends Move {

	// 1 - certain orbs, 2 - all orbs
	private int type;
	private List<Integer> orbs;
	// I don't think it's always 100%:
	private double percentChange;
	
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
	public double getPercentChange() {
		return percentChange;
	}
	public void setPercentChange(double percentChange) {
		this.percentChange = percentChange;
	}
	
}
