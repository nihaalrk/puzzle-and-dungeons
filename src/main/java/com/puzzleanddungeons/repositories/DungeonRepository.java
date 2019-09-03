package com.puzzleanddungeons.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.puzzleanddungeons.models.Dungeon;

public interface DungeonRepository extends CrudRepository <Dungeon, Integer> {
	
	@Query(value="SELECT entity FROM Dungeon entity")
    public List<Dungeon> findAllDungeons();
    
	@Query(value="SELECT entity FROM Dungeon entity WHERE id=:id")
    public Dungeon findDungeonById(@Param("id") Integer id);
	
}
