package com.puzzleanddungeons.models.moves;

public abstract class Move {

	private String name;
	private int type;
	private double damageMult;
	private String description;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public double getDamageMult() {
		return damageMult;
	}
	public void setDamageMult(double damageMult) {
		this.damageMult = damageMult;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
