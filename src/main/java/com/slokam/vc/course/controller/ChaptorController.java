package com.slokam.vc.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.course.entity.Chaptor;
import com.slokam.vc.course.service.ChaptorService;

@RestController
@RequestMapping("Chaptor") 
public class ChaptorController {
	 @Autowired
	 private ChaptorService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Chaptor>	 saveChaptor(@RequestBody Chaptor obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Chaptor>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Chaptor>	 deleteChaptor(@RequestBody Chaptor obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Chaptor>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Chaptor>> getAllChaptor(){
		 List<Chaptor> list = service.getAll();
		 return new ResponseEntity<List<Chaptor>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Chaptor> getByIdChaptor(@PathVariable Integer id) {
		  Chaptor obj =  service.getById(id);
		  return new ResponseEntity<Chaptor>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Chaptor>	 
	 deleteChaptor(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Chaptor>(HttpStatus.OK);
	 }
}

