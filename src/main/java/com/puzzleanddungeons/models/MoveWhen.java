package com.puzzleanddungeons.models;

import java.util.List;

public class MoveWhen {

	private double minHP;
	private double maxHP;
	private double pctChance;
	private boolean oneTimeUse;
	private List<Integer> monstersPresent;
	private List<Integer> orbsPresent;
	private int everyXTurns;
	
	public double getMinHP() {
		return minHP;
	}
	public void setMinHP(double minHP) {
		this.minHP = minHP;
	}
	public double getMaxHP() {
		return maxHP;
	}
	public void setMaxHP(double maxHP) {
		this.maxHP = maxHP;
	}
	public double getPctChance() {
		return pctChance;
	}
	public void setPctChance(double pctChance) {
		this.pctChance = pctChance;
	}
	public boolean isOneTimeUse() {
		return oneTimeUse;
	}
	public void setOneTimeUse(boolean oneTimeUse) {
		this.oneTimeUse = oneTimeUse;
	}
	public List<Integer> getMonstersPresent() {
		return monstersPresent;
	}
	public void setMonstersPresent(List<Integer> monstersPresent) {
		this.monstersPresent = monstersPresent;
	}
	public List<Integer> getOrbsPresent() {
		return orbsPresent;
	}
	public void setOrbsPresent(List<Integer> orbsPresent) {
		this.orbsPresent = orbsPresent;
	}
	public int getEveryXTurns() {
		return everyXTurns;
	}
	public void setEveryXTurns(int everyXTurns) {
		this.everyXTurns = everyXTurns;
	}
	
}
