package com.slokam.vc.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.course.entity.FeedBack;
import com.slokam.vc.course.service.FeedBackService;

@RestController
@RequestMapping("FeedBack") 
public class FeedBackController {
	 @Autowired
	 private FeedBackService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<FeedBack>	 saveFeedBack(@RequestBody FeedBack obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<FeedBack>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<FeedBack>	 deleteFeedBack(@RequestBody FeedBack obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<FeedBack>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<FeedBack>> getAllFeedBack(){
		 List<FeedBack> list = service.getAll();
		 return new ResponseEntity<List<FeedBack>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<FeedBack> getByIdFeedBack(@PathVariable Integer id) {
		  FeedBack obj =  service.getById(id);
		  return new ResponseEntity<FeedBack>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<FeedBack>	 
	 deleteFeedBack(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<FeedBack>(HttpStatus.OK);
	 }
}

