package com.slokam.vc.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.course.entity.Course;
import com.slokam.vc.course.service.CourseService;

@RestController
@RequestMapping("Course") 
public class CourseController {
	 @Autowired
	 private CourseService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Course>	 saveCourse(@RequestBody Course obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Course>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Course>	 deleteCourse(@RequestBody Course obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Course>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Course>> getAllCourse(){
		 List<Course> list = service.getAll();
		 return new ResponseEntity<List<Course>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Course> getByIdCourse(@PathVariable Integer id) {
		  Course obj =  service.getById(id);
		  return new ResponseEntity<Course>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Course>	 
	 deleteCourse(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Course>(HttpStatus.OK);
	 }
}

