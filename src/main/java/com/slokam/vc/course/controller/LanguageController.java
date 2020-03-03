package com.slokam.vc.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.course.entity.Language;
import com.slokam.vc.course.service.LanguageService;

@RestController
@RequestMapping("Language") 
public class LanguageController {
	 @Autowired
	 private LanguageService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Language>	 saveLanguage(@RequestBody Language obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Language>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Language>	 deleteLanguage(@RequestBody Language obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Language>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Language>> getAllLanguage(){
		 List<Language> list = service.getAll();
		 return new ResponseEntity<List<Language>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Language> getByIdLanguage(@PathVariable Integer id) {
		  Language obj =  service.getById(id);
		  return new ResponseEntity<Language>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Language>	 
	 deleteLanguage(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Language>(HttpStatus.OK);
	 }
}

