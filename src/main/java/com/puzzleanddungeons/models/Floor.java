package com.puzzleanddungeons.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="floors")
public class Floor {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	@ManyToOne
	@JsonIgnore
	private Dungeon dungeon;
	private int floorNum;
	private int numAppear;
	@ManyToMany
	@JoinTable(
	        name="floors_enemies",
	        joinColumns=@JoinColumn(name="floor_id", referencedColumnName="id"),
	        inverseJoinColumns=@JoinColumn(name="enemy_id", referencedColumnName="id"))
	private List<Enemy> enemies;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Dungeon getDungeon() {
		return dungeon;
	}
	public void setDungeon(Dungeon dungeon) {
		this.dungeon = dungeon;
	}
	public int getFloorNum() {
		return floorNum;
	}
	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}
	public int getNumAppear() {
		return numAppear;
	}
	public void setNumAppear(int numAppear) {
		this.numAppear = numAppear;
	}
	public List<Enemy> getEnemies() {
		return enemies;
	}
	public void setEnemies(List<Enemy> enemies) {
		this.enemies = enemies;
	}
	
}
