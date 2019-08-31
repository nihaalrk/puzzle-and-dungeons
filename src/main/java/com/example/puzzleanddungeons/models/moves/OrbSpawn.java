package com.example.puzzleanddungeons.models.moves;

import java.util.List;

public class OrbSpawn extends Move {
	
	private OrbsTargeted orbsTargeted;
	private List<Integer> toOrbs;
	
	public OrbsTargeted getOrbsTargeted() {
		return orbsTargeted;
	}
	public void setOrbsTargeted(OrbsTargeted orbsTargeted) {
		this.orbsTargeted = orbsTargeted;
	}
	public List<Integer> getToOrbs() {
		return toOrbs;
	}
	public void setToOrbs(List<Integer> toOrbs) {
		this.toOrbs = toOrbs;
	}
	
}
