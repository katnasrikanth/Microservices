package com.slokam.vc.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.course.entity.Tag;
import com.slokam.vc.course.service.TagService;

@RestController
@RequestMapping("Tag") 
public class TagController {
	 @Autowired
	 private TagService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Tag>	 saveTag(@RequestBody Tag obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Tag>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Tag>	 deleteTag(@RequestBody Tag obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Tag>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Tag>> getAllTag(){
		 List<Tag> list = service.getAll();
		 return new ResponseEntity<List<Tag>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Tag> getByIdTag(@PathVariable Integer id) {
		  Tag obj =  service.getById(id);
		  return new ResponseEntity<Tag>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Tag>	 
	 deleteTag(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Tag>(HttpStatus.OK);
	 }
}

