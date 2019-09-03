package com.puzzleanddungeons.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="dungeons")
public class Dungeon {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String name;
	@ManyToOne
	@JsonIgnore
	private DungeonGroup parent;
	private int stamina;
	@OneToMany(mappedBy="dungeon")
	private List<Floor> floors;
	// json list
	private String mechanics;
	private double attackMult;
	private double defenseMult;
	private double hpMult;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DungeonGroup getParent() {
		return parent;
	}
	public void setParent(DungeonGroup parent) {
		this.parent = parent;
	}
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	public List<Floor> getFloors() {
		return floors;
	}
	public void setFloors(List<Floor> floors) {
		this.floors = floors;
	}
	public String getMechanics() {
		return mechanics;
	}
	public void setMechanics(String mechanics) {
		this.mechanics = mechanics;
	}
	public double getAttackMult() {
		return attackMult;
	}
	public void setAttackMult(double attackMult) {
		this.attackMult = attackMult;
	}
	public double getDefenseMult() {
		return defenseMult;
	}
	public void setDefenseMult(double defenseMult) {
		this.defenseMult = defenseMult;
	}
	public double getHpMult() {
		return hpMult;
	}
	public void setHpMult(double hpMult) {
		this.hpMult = hpMult;
	}
	
}
