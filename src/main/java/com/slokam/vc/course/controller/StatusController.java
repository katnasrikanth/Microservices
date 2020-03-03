package com.slokam.vc.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.course.entity.Status;
import com.slokam.vc.course.service.StatusService;

@RestController
@RequestMapping("Status") 
public class StatusController {
	 @Autowired
	 private StatusService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Status>	 saveStatus(@RequestBody Status obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Status>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Status>	 deleteStatus(@RequestBody Status obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Status>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Status>> getAllStatus(){
		 List<Status> list = service.getAll();
		 return new ResponseEntity<List<Status>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Status> getByIdStatus(@PathVariable Integer id) {
		  Status obj =  service.getById(id);
		  return new ResponseEntity<Status>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Status>	 
	 deleteStatus(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Status>(HttpStatus.OK);
	 }
}

