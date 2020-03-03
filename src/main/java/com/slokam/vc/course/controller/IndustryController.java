package com.slokam.vc.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.course.entity.Industry;
import com.slokam.vc.course.service.IndustryService;

@RestController
@RequestMapping("Industry") 
public class IndustryController {
	 @Autowired
	 private IndustryService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Industry>	 saveIndustry(@RequestBody Industry obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Industry>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Industry>	 deleteIndustry(@RequestBody Industry obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Industry>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Industry>> getAllIndustry(){
		 List<Industry> list = service.getAll();
		 return new ResponseEntity<List<Industry>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Industry> getByIdIndustry(@PathVariable Integer id) {
		  Industry obj =  service.getById(id);
		  return new ResponseEntity<Industry>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Industry>	 
	 deleteIndustry(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Industry>(HttpStatus.OK);
	 }
}

