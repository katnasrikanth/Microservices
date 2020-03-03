package com.slokam.vc.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.course.entity.Technology;
import com.slokam.vc.course.service.TechnologyService;

@RestController
@RequestMapping("Technology") 
public class TechnologyController {
	 @Autowired
	 private TechnologyService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Technology>	 saveTechnology(@RequestBody Technology obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Technology>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Technology>	 deleteTechnology(@RequestBody Technology obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Technology>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Technology>> getAllTechnology(){
		 List<Technology> list = service.getAll();
		 return new ResponseEntity<List<Technology>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Technology> getByIdTechnology(@PathVariable Integer id) {
		  Technology obj =  service.getById(id);
		  return new ResponseEntity<Technology>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Technology>	 
	 deleteTechnology(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Technology>(HttpStatus.OK);
	 }
}

