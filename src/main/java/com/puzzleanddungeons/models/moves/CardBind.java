package com.puzzleanddungeons.models.moves;

public class CardBind extends Move {

	private int numTurns;
	private int numTargeted;
	// 1 - leaders, 2 - random subs, 3 - random all, 4 - attribute, 5 - typing
	private int type;
	private int typeTargeted;
	public int getNumTurns() {
		return numTurns;
	}
	public void setNumTurns(int numTurns) {
		this.numTurns = numTurns;
	}
	public int getNumTargeted() {
		return numTargeted;
	}
	public void setNumTargeted(int numTargeted) {
		this.numTargeted = numTargeted;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getTypeTargeted() {
		return typeTargeted;
	}
	public void setTypeTargeted(int typeTargeted) {
		this.typeTargeted = typeTargeted;
	}
	
}
