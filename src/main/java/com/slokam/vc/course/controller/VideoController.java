package com.slokam.vc.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.course.entity.Video;
import com.slokam.vc.course.service.VideoService;

@RestController
@RequestMapping("Video") 
public class VideoController {
	 @Autowired
	 private VideoService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Video>	 saveVideo(@RequestBody Video obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Video>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Video>	 deleteVideo(@RequestBody Video obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Video>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Video>> getAllVideo(){
		 List<Video> list = service.getAll();
		 return new ResponseEntity<List<Video>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Video> getByIdVideo(@PathVariable Integer id) {
		  Video obj =  service.getById(id);
		  return new ResponseEntity<Video>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Video>	 
	 deleteVideo(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Video>(HttpStatus.OK);
	 }
}

