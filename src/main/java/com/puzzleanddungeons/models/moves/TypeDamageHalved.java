package com.puzzleanddungeons.models.moves;

import java.util.List;

public class TypeDamageHalved extends Passive {

	private List<Integer> types;

	public List<Integer> getTypes() {
		return types;
	}

	public void setTypes(List<Integer> types) {
		this.types = types;
	}
	
}
