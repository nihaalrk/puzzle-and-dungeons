package com.puzzleanddungeons.models;

import com.puzzleanddungeons.models.moves.Move;

public class DungeonMechanic {

	private Move move;
	private int floor;
	
	public Move getMove() {
		return move;
	}
	public void setMove(Move move) {
		this.move = move;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
}
