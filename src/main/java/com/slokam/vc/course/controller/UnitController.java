package com.slokam.vc.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.course.entity.Unit;
import com.slokam.vc.course.service.UnitService;

@RestController
@RequestMapping("Unit") 
public class UnitController {
	 @Autowired
	 private UnitService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Unit>	 saveUnit(@RequestBody Unit obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Unit>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Unit>	 deleteUnit(@RequestBody Unit obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Unit>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Unit>> getAllUnit(){
		 List<Unit> list = service.getAll();
		 return new ResponseEntity<List<Unit>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Unit> getByIdUnit(@PathVariable Integer id) {
		  Unit obj =  service.getById(id);
		  return new ResponseEntity<Unit>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Unit>	 
	 deleteUnit(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Unit>(HttpStatus.OK);
	 }
}

