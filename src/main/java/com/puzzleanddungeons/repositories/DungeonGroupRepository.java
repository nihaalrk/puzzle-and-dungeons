package com.puzzleanddungeons.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.puzzleanddungeons.models.DungeonGroup;

public interface DungeonGroupRepository extends CrudRepository <DungeonGroup, Integer> {
	
	@Query(value="SELECT entity FROM DungeonGroup entity")
    public List<DungeonGroup> findAllDungeonGroups();
    
	@Query(value="SELECT entity FROM DungeonGroup entity WHERE id=:id")
    public DungeonGroup findDungeonGroupById(@Param("id") Integer id);
	
}
