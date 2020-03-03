package com.slokam.vc.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.course.entity.Eligibility;
import com.slokam.vc.course.service.EligibilityService;

@RestController
@RequestMapping("Eligibility") 
public class EligibilityController {
	 @Autowired
	 private EligibilityService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Eligibility>	 saveEligibility(@RequestBody Eligibility obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Eligibility>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Eligibility>	 deleteEligibility(@RequestBody Eligibility obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Eligibility>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Eligibility>> getAllEligibility(){
		 List<Eligibility> list = service.getAll();
		 return new ResponseEntity<List<Eligibility>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Eligibility> getByIdEligibility(@PathVariable Integer id) {
		  Eligibility obj =  service.getById(id);
		  return new ResponseEntity<Eligibility>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Eligibility>	 
	 deleteEligibility(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Eligibility>(HttpStatus.OK);
	 }
}

