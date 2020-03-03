package com.slokam.vc.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.course.entity.TechnologyLevel;
import com.slokam.vc.course.service.TechnologyLevelService;

@RestController
@RequestMapping("TechnologyLevel") 
public class TechnologyLevelController {
	 @Autowired
	 private TechnologyLevelService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<TechnologyLevel>	 saveTechnologyLevel(@RequestBody TechnologyLevel obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<TechnologyLevel>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<TechnologyLevel>	 deleteTechnologyLevel(@RequestBody TechnologyLevel obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<TechnologyLevel>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<TechnologyLevel>> getAllTechnologyLevel(){
		 List<TechnologyLevel> list = service.getAll();
		 return new ResponseEntity<List<TechnologyLevel>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<TechnologyLevel> getByIdTechnologyLevel(@PathVariable Integer id) {
		  TechnologyLevel obj =  service.getById(id);
		  return new ResponseEntity<TechnologyLevel>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<TechnologyLevel>	 
	 deleteTechnologyLevel(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<TechnologyLevel>(HttpStatus.OK);
	 }
}

