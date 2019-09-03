package com.puzzleanddungeons.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="enemies")
public class Enemy {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	@ManyToMany
	@JsonIgnore
	private List<Floor> dungeonFloors;
	private String name;
	private int monsterId;
	private int turnTimer;
	private int type1;
	private int type2;
	private int type3;
	private String moveset;
	private int baseAttack;
	private long baseDefense;
	private long baseHP;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Floor> getDungeonFloors() {
		return dungeonFloors;
	}
	public void setDungeonFloors(List<Floor> dungeonFloors) {
		this.dungeonFloors = dungeonFloors;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonsterId() {
		return monsterId;
	}
	public void setMonsterId(int monsterId) {
		this.monsterId = monsterId;
	}
	public int getTurnTimer() {
		return turnTimer;
	}
	public void setTurnTimer(int turnTimer) {
		this.turnTimer = turnTimer;
	}
	public int getType1() {
		return type1;
	}
	public void setType1(int type1) {
		this.type1 = type1;
	}
	public int getType2() {
		return type2;
	}
	public void setType2(int type2) {
		this.type2 = type2;
	}
	public int getType3() {
		return type3;
	}
	public void setType3(int type3) {
		this.type3 = type3;
	}
	public String getMoveset() {
		return moveset;
	}
	public void setMoveset(String moveset) {
		this.moveset = moveset;
	}
	public int getBaseAttack() {
		return baseAttack;
	}
	public void setBaseAttack(int baseAttack) {
		this.baseAttack = baseAttack;
	}
	public long getBaseDefense() {
		return baseDefense;
	}
	public void setBaseDefense(long baseDefense) {
		this.baseDefense = baseDefense;
	}
	public long getBaseHP() {
		return baseHP;
	}
	public void setBaseHP(long baseHP) {
		this.baseHP = baseHP;
	}
	
}
