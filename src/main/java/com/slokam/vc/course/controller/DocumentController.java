package com.slokam.vc.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.vc.course.entity.Document;
import com.slokam.vc.course.service.DocumentService;

@RestController
@RequestMapping("Document") 
public class DocumentController {
	 @Autowired
	 private DocumentService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Document>	 saveDocument(@RequestBody Document obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Document>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Document>	 deleteDocument(@RequestBody Document obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Document>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Document>> getAllDocument(){
		 List<Document> list = service.getAll();
		 return new ResponseEntity<List<Document>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Document> getByIdDocument(@PathVariable Integer id) {
		  Document obj =  service.getById(id);
		  return new ResponseEntity<Document>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<Document>	 
	 deleteDocument(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Document>(HttpStatus.OK);
	 }
}

