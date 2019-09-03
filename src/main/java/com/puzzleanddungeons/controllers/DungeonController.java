package com.puzzleanddungeons.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puzzleanddungeons.models.Dungeon;
import com.puzzleanddungeons.repositories.DungeonRepository;

@CrossOrigin(value = "*")
@RestController
public class DungeonController {

	@Autowired
	DungeonRepository repository;
	
	@GetMapping("/api/dungeons")
    public List<Dungeon> findAllDungeons() {
    	return repository.findAllDungeons();
    }
	
}
