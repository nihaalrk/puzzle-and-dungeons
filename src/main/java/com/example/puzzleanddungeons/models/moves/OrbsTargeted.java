package com.example.puzzleanddungeons.models.moves;

import java.util.List;

public class OrbsTargeted {
	
	// 1 - X orbs (all or count)
	// 2 - Non-X orbs (all or count)
	// 3 - Any orbs (count)
	// 4 - All orbs
	// 5 - Pattern based
	private int type;
	
	private List<Integer> orbTypes;
	private int count;
	private String pattern;
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public List<Integer> getOrbTypes() {
		return orbTypes;
	}
	public void setOrbTypes(List<Integer> orbTypes) {
		this.orbTypes = orbTypes;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
}
