package com.puzzleanddungeons.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puzzleanddungeons.models.DungeonGroup;
import com.puzzleanddungeons.repositories.DungeonGroupRepository;

@CrossOrigin(value = "*")
@RestController
public class DungeonGroupController {

	@Autowired
	DungeonGroupRepository repository;
	
	@GetMapping("/api/dungeon_groups")
    public List<DungeonGroup> findAllDungeonGroups() {
    	return repository.findAllDungeonGroups();
    }
	
}
