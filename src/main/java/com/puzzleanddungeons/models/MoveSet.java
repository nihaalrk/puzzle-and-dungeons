package com.puzzleanddungeons.models;

public class MoveSet {

	// list of passives
	private String passives;
	// list of preemptives
	private String preemptives;
	// some pre-emptives conditional on party members
	private String preemptivesWhen;
	// list of moves
	private String moves;
	// list of move whens
	private String moveWhens;
	
	public String getPassives() {
		return passives;
	}
	public void setPassives(String passives) {
		this.passives = passives;
	}
	public String getPreemptives() {
		return preemptives;
	}
	public void setPreemptives(String preemptives) {
		this.preemptives = preemptives;
	}
	public String getPreemptivesWhen() {
		return preemptivesWhen;
	}
	public void setPreemptivesWhen(String preemptivesWhen) {
		this.preemptivesWhen = preemptivesWhen;
	}
	public String getMoves() {
		return moves;
	}
	public void setMoves(String moves) {
		this.moves = moves;
	}
	public String getMoveWhens() {
		return moveWhens;
	}
	public void setMoveWhens(String moveWhens) {
		this.moveWhens = moveWhens;
	}
	
	
}
