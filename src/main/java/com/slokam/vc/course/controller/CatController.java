package com.slokam.vc.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.course.entity.Cat;
import com.slokam.vc.course.service.CatService;

@RestController
@RequestMapping("Cat") 
public class CatController {
	 @Autowired
	 private CatService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Cat>	 saveCat(@RequestBody Cat obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Cat>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Cat>	 deleteCat(@RequestBody Cat obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Cat>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Cat>> getAllCat(){
		 List<Cat> list = service.getAll();
		 return new ResponseEntity<List<Cat>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Cat> getByIdCat(@PathVariable Integer id) {
		  Cat obj =  service.getById(id);
		  return new ResponseEntity<Cat>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Cat>	 
	 deleteCat(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Cat>(HttpStatus.OK);
	 }
}

