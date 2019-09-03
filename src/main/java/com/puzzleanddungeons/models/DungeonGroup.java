package com.puzzleanddungeons.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dungeon_groups")
public class DungeonGroup {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String name;
	@OneToMany(mappedBy="parent")
	private List<Dungeon> dungeons;
	
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
	public List<Dungeon> getDungeons() {
		return dungeons;
	}
	public void setDungeons(List<Dungeon> dungeons) {
		this.dungeons = dungeons;
	}
	
}
